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
public class Combustion extends AutoAbstract {

  String tipoGasolina;

  @Override
  public String getInfo() {
    return "Color: " + getColor();
  }
}
