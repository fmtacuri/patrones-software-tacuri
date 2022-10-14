package com.tacuri.trabajo1.tacuri.enums;

import java.util.Arrays;
import lombok.Getter;

public enum TipoCombustible {
  SUPER("S"),
  EXTRA("E"),
  DIESEL("D");

  @Getter
  private String abbr;

  private TipoCombustible(String abbr) {
    this.abbr = abbr;
  }

  public String getType(String type) {
    return Arrays.stream(values()).filter(value -> value.getAbbr().equals(type)).findFirst().get().getAbbr();
  }
}
