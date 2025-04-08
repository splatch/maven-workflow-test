package com.github.splatch.iconify.descriptor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IconifyIconSet {

  private String prefix;
  private Collection info;
  private Map<String, IconifyIcon> icons;

  int width;
  int height;

  public String getPrefix() {
    return prefix;
  }

  public Collection getInfo() {
    return info;
  }

  public Map<String, IconifyIcon> getIcons() {
    return icons;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

}
