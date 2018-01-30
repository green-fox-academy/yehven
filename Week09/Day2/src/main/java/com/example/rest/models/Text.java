package com.example.rest.models;

import java.util.ArrayList;
import java.util.Arrays;

public class Text {
  private String sith_text;

  public Text() {
  }

  public Text(String sith_text) {
    this.sith_text = reversedInputText(sith_text);
  }

  private String reversedInputText(String inputText) {
    String s = inputText;
    ArrayList<String> wordArrayList = new ArrayList<>();
    for (String word : s.split("\\W+")) {
      wordArrayList.add(word);
    }
    if (wordArrayList.size() % 2 == 0) {
      for (int i = 0; i < wordArrayList.size(); i += 2) {
        String temporary = wordArrayList.get(i+1);
        wordArrayList.set(i+1, wordArrayList.get(i));
        wordArrayList.set(i, temporary);
      }
      String tempFirst = wordArrayList.get(0);
      String changedFirst = tempFirst.substring(0, 1).toUpperCase() + tempFirst.substring(1);
      String tempSecond = wordArrayList.get(1);
      String changedSecond = tempSecond.substring(0, 1).toLowerCase() + tempSecond.substring(1);
      wordArrayList.set(0, changedFirst);
      wordArrayList.set(1, changedSecond);
      String resultSentence = "";
      for (String h : wordArrayList) {
        resultSentence += h + " ";
      }
      resultSentence = resultSentence + "." + " Arrgh. Uhmm. For just fun. Err..err.err.";
      return resultSentence;
    }else {
      for (int i = 0; i < wordArrayList.size()-1; i += 2) {
        String temporary = wordArrayList.get(i + 1);
        wordArrayList.set(i + 1, wordArrayList.get(i));
        wordArrayList.set(i, temporary);
      }
      String tempFirst = wordArrayList.get(0);
      String changedFirst = tempFirst.substring(0, 1).toUpperCase() + tempFirst.substring(1);
      String tempSecond = wordArrayList.get(1);
      String changedSecond = tempSecond.substring(0, 1).toLowerCase() + tempSecond.substring(1);
      wordArrayList.set(0, changedFirst);
      wordArrayList.set(1, changedSecond);
      String resultSentence = "";
      for (String h : wordArrayList) {
        resultSentence += h + " ";
      }
      resultSentence = resultSentence + "." + " Arrgh. Uhmm. For just fun. Err..err.err.";
      return resultSentence;
    }
  }

  public String getText() {
    return sith_text;
  }

  public void setText(String text) {
    this.sith_text = text;
  }
}

