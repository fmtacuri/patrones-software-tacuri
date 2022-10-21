package com.tacuri.factory;

public class ContratoFijo implements Contrato{

  @Override
  public String mostrarSueldo() {
    return "500";
  }
}
