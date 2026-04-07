package com.udemy.patterns.structural.facade;

/**
 * Subsystem: PaymentProcessor
 * Clase interna del sistema. Se implementa la lógica de negocio real.
 *  * Clase independiente que no conoce el facade y contiene la complejidad.
 */
public class PaymentProcessor {

  void process() {
    System.out.println("Procesando pago...");
  }
}
