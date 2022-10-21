package com.tacuri.factory;

import java.util.function.Supplier;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ContratoType {

  FIJO(ContratoFijo::new),
  TEMPORAL(ContratoTemporal::new);

  private final Supplier<Contrato> contratoSupplier;
}
