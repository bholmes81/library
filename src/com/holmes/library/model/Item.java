package com.holmes.library.model;

public class Item {
  
  private Type type;
  private String name;
  private String genre;
  private int id;
  public Type getType() {
    return type;
  }
  public void setType(Type type) {
    this.type = type;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getGenre() {
    return genre;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }

}
