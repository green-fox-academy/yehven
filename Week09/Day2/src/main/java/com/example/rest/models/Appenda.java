package com.example.rest.models;

public class Appenda {
  private String appended;

  public Appenda(String appended) {
    this.appended = appended + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
