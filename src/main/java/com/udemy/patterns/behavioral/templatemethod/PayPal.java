package com.udemy.patterns.behavioral.templatemethod;

/**
 * ConcreteSubClass2: PayPal
 */
public class PayPal extends Payment {

  @Override
  void initialize() {
    System.out.println("Inicializando el pago con PayPal...");
  }

  @Override
  void startPayment() {
    System.out.println("Realizando el pago con PayPal...");
  }

  @Override
  void endPayment() {
    System.out.println("Finalizando el pago a través de los servidores PayPal...");
  }
}
