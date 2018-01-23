package com.example.rest.models;

public class ArrayResultInt {
  private int result;

  public ArrayResultInt(String what, Integer[] numbers) {
    if (what.equals("sum")) {
      result = sum(numbers);
    } else if (what.equals("multiply")) {
      result = multiply(numbers);
    }
  }

  public int sum(Integer[] numbers) {
    int result = 0;
    for (int i = 0; i < numbers.length; i++) {
      result += numbers[i];
    }
    return result;
  }

  public int multiply(Integer[] numbers) {
    int result = 1;
    for (int j = 0; j < numbers.length; j++) {
      result *= numbers[j];
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
