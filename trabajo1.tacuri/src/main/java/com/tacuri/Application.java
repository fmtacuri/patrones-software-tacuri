package com.tacuri;

import com.tacuri.abstracts.AutoAbstract;
import com.tacuri.abstracts.Combustion;
import com.tacuri.abstracts.Electrico;
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

  }

}
