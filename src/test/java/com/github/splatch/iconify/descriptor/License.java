package com.github.splatch.iconify.descriptor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class License {

  private String title;
  private String spdx;
  private String url;

  public String getTitle() {
    return title;
  }

  public String getSpdx() {
    return spdx;
  }

  public String getUrl() {
    return url;
  }

}
