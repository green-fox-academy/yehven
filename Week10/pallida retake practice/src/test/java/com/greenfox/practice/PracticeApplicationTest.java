package com.greenfox.practice;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfox.practice.PracticeApplication;
import com.greenfox.practice.models.Items;
import com.greenfox.practice.models.Response;
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
@SpringBootTest(classes = PracticeApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class PracticeApplicationTest {

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
  public void emptylist() throws Exception {
    ArrayList response = new ArrayList();
    mockMvc.perform(get("/shoppingplanner/query?price=30&type=lower")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()
            )
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.itemslist", is(response)));
  }

  @Test
  public void below40() throws Exception {
    //Items item1 = new Items("Strecth Steamed Pencil Skirt","Calvin Klein","skirts","s",39,0);
    mockMvc.perform(get("/shoppingplanner/query?price=40&type=lower")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()
            )
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.itemslist[1].manufacturer", is("Calvin Klein")));
  }
}