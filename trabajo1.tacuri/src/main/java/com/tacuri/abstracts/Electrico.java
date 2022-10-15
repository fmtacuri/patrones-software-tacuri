package com.tacuri.abstracts;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Electrico extends AutoAbstract {

  int capacidadBateria;

  @Override
  public String getInfo() {
    return "Cilindraje: " + getCilindraje();
  }
}
