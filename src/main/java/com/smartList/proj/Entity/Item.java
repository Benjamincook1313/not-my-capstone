package com.smartList.proj.Entity;

import javax.persistence.*;
@Entity
public class Item {

  @Id
  @GeneratedValue
  private int id;
  private String item;
  private int qty;
  private String type;

  private Boolean crossOff = false;

  public Item(){}

  public Item(int id, String item, int qty, String type) {
    this.id = id;
    this.item = item;
    this.qty = qty;
    this.type = type;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getItem() {
    return item;
  }

  public void setItem(String item) { this.item = item; }


  public int getQty() { return qty; }

  public void setQty(int qty) {
    this.qty = qty;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) { this.type = type; }


  public Boolean getCrossOff() { return crossOff; }
  public void setCrossOff(Boolean crossOff) { this.crossOff = crossOff; }

}
