package com.tacuri.factory;

public class ContratoFactory {

  public static Contrato getContrato(ContratoType tipo) {
    return tipo.getContratoSupplier().get();
  }

}
