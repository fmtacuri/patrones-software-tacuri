package com.tacuri.strategy;

import com.tacuri.strategy.enums.TiposEnum;
import com.tacuri.strategy.impl.MixtoImpl;
import com.tacuri.strategy.impl.ParticularImpl;
import com.tacuri.strategy.impl.PublicoImpl;

public class AvaluoStrategy {

  public static float getAvaluo(TiposEnum tipo, float valorOriginal) {
    switch (tipo) {
      case MIXTO:
        return new MixtoImpl().calcularAvaluo(valorOriginal);
      case PUBLICO:
        return new PublicoImpl().calcularAvaluo(valorOriginal);
      case PARTICULAR:
        return new ParticularImpl().calcularAvaluo(valorOriginal);
      default:
        throw new AssertionError();
    }
  }

}
