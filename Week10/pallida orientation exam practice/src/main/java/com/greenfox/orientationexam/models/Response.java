package com.greenfox.orientationexam.models;

import java.util.List;

public class Response {
  private String result;
  private List<Car> data;

  public Response() {
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Car> getData() {
    return data;
  }

  public void setData(List<Car> data) {
    this.data = data;
  }
}
