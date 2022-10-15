package com.tacuri.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Auto extends Marca {

  String modelo;
  int year;
  String color;
  int cilindraje;
  double costo;

  public double calcularMatricula(int year) {
    return 2022 - year;
  }

  public int calcularEdad(int year) {
    return 2022 - year;
  }

  public boolean esTaxi() {
    return Boolean.TRUE;
  }
}
