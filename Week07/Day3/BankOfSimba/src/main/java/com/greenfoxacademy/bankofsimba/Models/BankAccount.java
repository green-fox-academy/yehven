package com.greenfoxacademy.bankofsimba.Models;

public class BankAccount {
  String name;
  double balance;
  String animalType;
  boolean king;
  boolean isGood;

  public BankAccount() {
  }

  public BankAccount(String name, double balance, String animalType, boolean king, boolean isGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = king;
    this.isGood = isGood;
  }

  public boolean isGood() {
    return isGood;
  }

  public void setGood(boolean isGood) {
    this.isGood = isGood;
  }

  public boolean isKing() {
    return king;
  }

  public void setKing(boolean king) {
    this.king = king;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void increaseBalance (){
    if (king) {
      setBalance((getBalance() + 100));
    } else {
      setBalance((getBalance() + 10));
    }
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

}
