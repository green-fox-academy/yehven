package com.example.rest.controllers;

import com.example.rest.models.*;
import com.example.rest.models.ArrayHandler.ArrayResponse;
import com.example.rest.models.ArrayHandler.ArrayResultArray;
import com.example.rest.models.ArrayHandler.ArrayResultInt;
import com.example.rest.models.DoUntil.Until;
import com.example.rest.models.DoUntil.UntilResponse;
import com.example.rest.models.Logs.Log;
import com.example.rest.models.Logs.LogResult;
import com.example.rest.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  LogService logService;

  @GetMapping(value = "/doubling")
  public Object doubling(@RequestParam(value="input", required = false) Integer received) {
    if (!(received==null)) {
      Log logCreated = new Log();
      logCreated.setEndpoint("/doubling");
      logCreated.setData("input:" + received);
      logService.createLog(logCreated);
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
      Log logCreated = new Log();
      logCreated.setEndpoint("/greeter");
      logCreated.setData("input(Name & Title):" + name + " & " + title);
      logService.createLog(logCreated);
      return new Greeter(name,title);
    }
  }

  @GetMapping(value = "/appenda/{appendable}")
  public Object appenda(@RequestParam(value="appenda", required = false) String input,@PathVariable String appendable) {
    if (!(appendable==null)) {
      Log logCreated = new Log();
      logCreated.setEndpoint("/appenda/" + appendable);
      logCreated.setData("input: " + appendable);
      logService.createLog(logCreated);
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
      Log logCreated = new Log();
      logCreated.setEndpoint("/dountil/" + what);
      logCreated.setData("input: " + until.getUntil());
      logService.createLog(logCreated);
      UntilResponse untilResponse = new UntilResponse(what, until);
      return untilResponse;
    }
  }

  @PostMapping("/arrays")
  public Object arrayHandler(@RequestBody (required = false) ArrayResponse arrayResponse ) {
    if (arrayResponse==null){
      return new ErrorMessage("Please provide a number!");
    } else if (arrayResponse.getWhat().equals("multiply") || arrayResponse.getWhat().equals("sum")){
      Log logCreated = new Log();
      logCreated.setEndpoint("/arrays");
      logCreated.setData("input: " + arrayResponse.getWhat() + String.valueOf(Arrays.asList(arrayResponse.getNumbers())));
      logService.createLog(logCreated);
      ArrayResultInt arrayResultInt = new ArrayResultInt(arrayResponse.getWhat(), arrayResponse.getNumbers());
      return arrayResultInt;
    } else if (arrayResponse.getWhat().equals("double")){
      Log logCreated = new Log();
      logCreated.setEndpoint("/arrays");
      logCreated.setData("input:" + arrayResponse.getWhat() + String.valueOf(Arrays.asList(arrayResponse.getNumbers())));
      logService.createLog(logCreated);
      ArrayResultArray arrayResultArray = new ArrayResultArray(arrayResponse.getNumbers());
      return arrayResultArray;
    }else {
      return null;
    }
  }

  @GetMapping("/log")
  public Object log() {
    Log logCreated = new Log();
    logCreated.setEndpoint("/log");
    logCreated.setData("input: no input");
    logService.createLog(logCreated);
    LogResult logOutput = new LogResult(logService.getAllLogs(), logService.getAllLogs().size());
    return logOutput;
  }

  @PostMapping("/sith")
  public Object postSith(@RequestBody (required = false) TextInput text) {
    if (text == null) {
      return new ErrorMessage("Feed me some text you have to, padawan young you are. Hmmm.");
    }else {
      return new Text(text.getText());
    }
  }

}
