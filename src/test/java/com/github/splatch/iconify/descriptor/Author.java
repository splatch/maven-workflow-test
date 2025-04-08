package com.github.splatch.iconify.descriptor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Author {

  private String name;
  private String url;

  public String getName() {
    return name;
  }

  public String getUrl() {
    return url;
  }

}
