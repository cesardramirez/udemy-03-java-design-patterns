package com.udemy.patterns.structural.facade;

/**
 * Subsystem: BankService
 * Clase interna del sistema. Se implementa la lógica de negocio real.
 * Clase independiente que no conoce el facade y contiene la complejidad.
 */
public class BankService {

  boolean hasFunds() {
    System.out.println("Verificando fondos...");
    return true;
  }
}
