package com.example.rest.models.DoUntil;

public class UntilResponse {
  private int result;

  public UntilResponse() {
  }

  public UntilResponse(String operation, Until until) {
    if (operation.equals("sum")) {
      result = sum(until.getUntil());
    } else if (operation.equals("factor")){
      result = factor(until.getUntil());
    }
  }

  private int factor(int inputNumber) {
    int result = 1;
    for (int j = 1; j <= inputNumber; j++) {
      result *= j;
    }
    return result;
  }

  private int sum(int inputNumber) {
    int result = 0;
    for (int j = 1; j <= inputNumber; j++) {
      result += j;
    }
    return result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
  
}
