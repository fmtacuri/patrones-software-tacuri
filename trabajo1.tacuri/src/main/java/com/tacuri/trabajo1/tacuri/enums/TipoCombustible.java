package com.tacuri.trabajo1.tacuri.enums;

public enum TipoCombustible {
  SUPER,
  EXTRA,
  DIESEL;

  public String getType(String type) {
    return TipoCombustible.valueOf(type).getType(type);
  }
}
