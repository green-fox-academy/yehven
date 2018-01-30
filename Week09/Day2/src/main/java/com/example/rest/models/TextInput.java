package com.example.rest.models;

public class TextInput {
  private String text;

  public TextInput() {
  }

  public TextInput(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
