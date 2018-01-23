package com.example.rest.controllers;

import com.example.rest.models.*;
import org.springframework.web.bind.annotation.*;

import javax.xml.stream.FactoryConfigurationError;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping(value = "/doubling")
  public Object doubling(@RequestParam(value="input", required = false) Integer received) {
    if (!(received==null)) {
      return new Doubler(received);
    } else {
      return new ErrorMessage("Please provide an input!");
    }
  }

  @GetMapping(value = "/greeter")
  public Object greeter(@RequestParam(value="name", required = false) String name,
                        @RequestParam(value="title", required = false) String title) {
    if (name==null) {
      return new ErrorMessage("Please provide a name!");
    } else if (title==null){
      return new ErrorMessage("Please provide a title!");
    } else {
      return new Greeter(name,title);
    }
  }

  @GetMapping(value = "/appenda/{appendable}")
  public Object appenda(@RequestParam(value="appenda", required = false) String input,@PathVariable String appendable) {
    if (!(appendable==null)) {
      return new Appenda(appendable);
    } else {
      return new ErrorMessage("Please provide an input!");
    }
  }

  @PostMapping("/dountil/{what}")
  public Object untilResponse(@PathVariable String what, @RequestBody (required = false) Until until) {
    if (until==null){
      return new ErrorMessage("Please provide a number!");
    } else {
      UntilResponse untilResponse = new UntilResponse(what, until);
      return untilResponse;
    }
  }

  @PostMapping("/arrays")
  public Object arrayHandler(@RequestBody (required = false) ArrayResponse arrayResponse ) {
    if (arrayResponse==null){
      return new ErrorMessage("Please provide a number!");
    } else if (arrayResponse.getWhat().equals("multiply") || arrayResponse.getWhat().equals("sum")){
      ArrayResultInt arrayResultInt = new ArrayResultInt(arrayResponse.getWhat(), arrayResponse.getNumbers());
      return arrayResultInt;
    } else if (arrayResponse.getWhat().equals("double")){
      ArrayResultArray arrayResultArray = new ArrayResultArray(arrayResponse.getNumbers());
      return arrayResultArray;
    }else {
      return null;
    }
  }

}
