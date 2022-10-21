package com.tacuri.singleton;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class ObjectMapperSingleton {

  private static ObjectMapper objectMapper;

  public static ObjectMapper getInstance() {
    if (objectMapper == null) {
      objectMapper = new ObjectMapper();
    }
    return objectMapper;
  }

}
