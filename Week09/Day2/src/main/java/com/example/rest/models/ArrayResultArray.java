package com.example.rest.models;

public class ArrayResultArray {
  private Integer[]numbers;

  public ArrayResultArray(Integer[] numbers) {
    this.numbers = getDouble(numbers);
  }

  public Integer[] getDouble(Integer[] numbers) {
    for (int j = 0; j < numbers.length; j++) {
      numbers[j] *= 2;
    }
    return numbers;
  }

  public Integer[] getNumbers() {
    return numbers;
  }

  public void setNumbers(Integer[] numbers) {
    this.numbers = numbers;
  }

}
