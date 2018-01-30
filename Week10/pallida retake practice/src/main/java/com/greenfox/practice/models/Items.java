package com.greenfox.practice.models;

import javax.persistence.*;

@Entity
@Table(name = "warehouse")
public class Items {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String itemName;
  private String manufacturer;
  private String category;
  private String size;
  private int unitPrice;
  private int inStore;


  public Items() {
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public int getInStore() {
    return inStore;
  }

  public void setInStore(int inStore) {
    this.inStore = inStore;
  }

  public int getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(int unitPrice) {
    this.unitPrice = unitPrice;
  }
}
