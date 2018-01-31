package com.greenfox.orientationexam.models;

import javax.persistence.*;

@Entity
@Table(name = "licence_plates")
public class Car {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String plate;
  private String carBrand;
  private String carModel;
  private String color;
  private int year;

  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public String getCarBrand() {
    return carBrand;
  }

  public void setCarBrand(String carBrand) {
    this.carBrand = carBrand;
  }

  public String getCarModel() {
    return carModel;
  }

  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public Car() {
  }

  public Car(String plate, String carBrand, String carModel, int year, String color) {

    this.plate = plate;
    this.carBrand = carBrand;
    this.carModel = carModel;
    this.year = year;
    this.color = color;
  }
}
