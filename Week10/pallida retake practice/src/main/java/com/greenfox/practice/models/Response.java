package com.greenfox.practice.models;

import java.util.List;

public class Response {
  private String result;
  private List<Items> itemslist;

  public Response() {
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Items> getItemslist() {
    return itemslist;
  }

  public void setItemslist(List<Items> itemslist) {
    this.itemslist = itemslist;
  }
}
