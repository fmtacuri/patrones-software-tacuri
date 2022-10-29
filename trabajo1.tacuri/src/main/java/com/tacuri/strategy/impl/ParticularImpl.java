package com.tacuri.strategy.impl;

import com.tacuri.strategy.AvaluoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ParticularImpl implements AvaluoService {

  @Override
  public float calcularAvaluo(float valorOriginal) {
    return 20;
  }
}
