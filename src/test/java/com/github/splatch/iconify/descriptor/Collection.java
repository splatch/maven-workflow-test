package com.github.splatch.iconify.descriptor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Collection {

  private String name;
  private int total;
  private Author author;
  private License license;
  private String category;

  public String getName() {
    return name;
  }

  public int getTotal() {
    return total;
  }

  public Author getAuthor() {
    return author;
  }

  public License getLicense() {
    return license;
  }

  public String getCategory() {
    return category;
  }
}
