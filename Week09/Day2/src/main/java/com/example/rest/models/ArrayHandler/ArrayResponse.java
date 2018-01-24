package com.example.rest.models.ArrayHandler;

public class ArrayResponse {
  private String what;
  private Integer[] numbers;

  public ArrayResponse(String what, Integer[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public ArrayResponse() {
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public Integer[] getNumbers() {
    return numbers;
  }

  public void setNumbers(Integer[] numbers) {
    this.numbers = numbers;
  }

}
