package com.example.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class RestApplicationTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  private MockMvc mockMvc;

  private HttpMessageConverter mappingJackson2HttpMessageConverter;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Autowired
  void setConverters(HttpMessageConverter<?>[] converters) {

    this.mappingJackson2HttpMessageConverter = Arrays.asList(converters).stream()
            .filter(hmc -> hmc instanceof MappingJackson2HttpMessageConverter)
            .findAny()
            .orElse(null);

    assertNotNull("the JSON message converter must not be null",
            this.mappingJackson2HttpMessageConverter);
  }

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void doublingWithInputNumber() throws Exception {
    mockMvc.perform(get("/doubling?input=4")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()
            )
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.received", is(4)))
            .andExpect(jsonPath("$.result", is(8)));
  }

  @Test
  public void doublingWithoutInputNumber() throws Exception {
    mockMvc.perform(get("/doubling")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()
            )
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }

  @Test
  public void greeterWithInputNameAndTitle() throws Exception {
    mockMvc.perform(get("/greeter?name=Petike&title=student")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()
            )
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));
  }

  @Test
  public void greeterWithoutInputName() throws Exception {
    mockMvc.perform(get("/greeter?title=student")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()
            )
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a name!")));
  }

  @Test
  public void greeterWithoutInputTitle() throws Exception {
    mockMvc.perform(get("/greeter?name=Petike")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()
            )
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a title!")));
  }

  @Test
  public void appendaName() throws Exception {
    mockMvc.perform(get("/appenda/kuty")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()
            )
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.appended", is("kutya")));
  }

  @Test
  public void appendaWithoutAppendable() throws Exception {
    mockMvc.perform(get("/appenda")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().is4xxClientError()
            );
  }

  @Test
  public void doUntilFactorInputProvided() throws Exception {
    mockMvc.perform(post("/dountil/factor")
                    .contentType("application/json;charset=UTF-8")
                    .content("{\"until\": 5}")
                    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(120)));
  }

  @Test
  public void doUntilSumInputProvided() throws Exception {
    mockMvc.perform(post("/dountil/sum")
            .contentType("application/json;charset=UTF-8")
            .content("{\"until\": 5}")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(15)));
  }

  @Test
  public void doUntilOperationProvidedButInputNumberNotProvided() throws Exception {
    mockMvc.perform(post("/dountil/factor")
            .contentType("application/json;charset=UTF-8")
            .content("")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.error", is("Please provide a number!")));
  }

  @Test
  public void doUntilWithoutOperationProvided() throws Exception {
    mockMvc.perform(post("/dountil")
            .contentType("application/json;charset=UTF-8")
            .content("{\"until\": 5}")
            )
            .andExpect(status().is4xxClientError());
  }

  @Test
  public void arrayHandlerWithoutOperationProvided() throws Exception {
    mockMvc.perform(post("/arrays")
            .contentType("application/json;charset=UTF-8")
            .content("")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.error", is("Please provide a number!")));
  }

  @Test
  public void arrayHandlerSumInputProvided() throws Exception {
    mockMvc.perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"sum\", \"numbers\": [1,2,5,10]}")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(18)));
  }

  @Test
  public void arrayHandlerMultiplyInputProvided() throws Exception {
    mockMvc.perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"multiply\", \"numbers\": [1,2,5,10]}")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(100)));
  }

  @Test
  public void arrayHandlerDoubleInputProvided() throws Exception {
    List<Integer> testArray = new ArrayList<>(Arrays.asList(2,4,10,20));

    mockMvc.perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"double\", \"numbers\": [1,2,5,10]}")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.numbers", is( testArray)));
  }

  @Test
  public void logTestCreatedAt() throws Exception {
    mockMvc.perform(get("/log")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()
            )
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.entries[2].createdAt", is("2018-01-24T17:32:51.532")));
  }

  @Test
  public void logTestData() throws Exception {
    mockMvc.perform(get("/log")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()
            )
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.entries[2].data", is("input(Name & Title):Ádika & student")));
  }

  @Test
  public void logTestEndpoint() throws Exception {
    mockMvc.perform(get("/log")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()
            )
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.entries[2].endpoint", is("/greeter")));
  }
}