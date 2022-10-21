package com.webApp.demo.Entity;

import javax.persistence.*;

@Entity
public class NewList {

  @Id
  @GeneratedValue
  private int id;
  private String listName;
  private String description;

  public NewList(){}

  public NewList(int id, String listName, String description) {
    this.id = id;
    this.listName = listName;
    this.description = description;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getListName() {
    return listName;
  }

  public void setListName(String listName) {
    this.listName = listName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
