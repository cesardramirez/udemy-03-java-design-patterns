package com.udemy.patterns.behavioral.templatemethod;

/**
 * ConcreteSubClass1: Visa
 */
public class Visa extends Payment {

  @Override
  void initialize() {
    System.out.println("Inicializando el pago con Visa...");
  }

  @Override
  void startPayment() {
    System.out.println("Realizando el pago con Visa...");
  }

  @Override
  void endPayment() {
    System.out.println("Finalizando el pago a través de los servidores Visa...");
  }
}
