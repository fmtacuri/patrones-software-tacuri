package com.tacuri.singleton;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperSingleton {

  private static ObjectMapper objectMapper;

  private ObjectMapperSingleton() {
    throw new IllegalStateException("Utility class");
  }
  public static ObjectMapper getInstance() {
    if (objectMapper == null) {
      objectMapper = new ObjectMapper();
    }
    return objectMapper;
  }

}
