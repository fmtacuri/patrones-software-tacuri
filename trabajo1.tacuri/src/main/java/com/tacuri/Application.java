package com.tacuri;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tacuri.abstracts.AutoAbstract;
import com.tacuri.abstracts.Combustion;
import com.tacuri.abstracts.Electrico;
import com.tacuri.factory.Contrato;
import com.tacuri.factory.ContratoFactory;
import com.tacuri.factory.ContratoType;
import com.tacuri.singleton.ObjectMapperSingleton;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class Application {

  public static void main(String[] args) {

    SpringApplication.run(Application.class, args);

    AutoAbstract auto1 = new Combustion();
    AutoAbstract auto2 = new Electrico();
    auto1.setColor("Rojo");
    auto2.setCilindraje(1000);

    log.info("Auto1: {}", auto1::getInfo);
    log.info("Auto2: {}", auto2::getInfo);

    log.info("------------------- FACTORY ----------");

    Contrato contratoFijo = ContratoFactory.getContrato(ContratoType.FIJO);
    Contrato contratoTemporal = ContratoFactory.getContrato(ContratoType.TEMPORAL);

    log.info("Fijo: {}", contratoFijo::mostrarSueldo);
    log.info("Temporal: {}", contratoTemporal::mostrarSueldo);

    log.info("------------------- SINGLETON ----------");

    ObjectMapper mapperOne = ObjectMapperSingleton.getInstance();
    ObjectMapper mapperTwo = ObjectMapperSingleton.getInstance();

    log.info("instanceOne: {}", () -> mapperOne);
    log.info("instanceTwo: {}", () -> mapperTwo);

  }


}
