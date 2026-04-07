package com.udemy.patterns.structural.facade;

/**
 * Subsystem: CardValidator
 * Clase interna del sistema. Se implementa la lógica de negocio real.
 * Clase independiente que no conoce el facade y contiene la complejidad.
 */
public class CardValidator {

  boolean validate() {
    System.out.println("Validando tarjeta...");
    return true;
  }
}
