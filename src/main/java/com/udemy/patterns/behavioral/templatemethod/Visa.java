package com.udemy.patterns.behavioral.templatemethod;

/**
 * ConcreteSubClass1: Visa
 */
public class Visa extends Payment {

  @Override
  protected void initialize() {
    System.out.println("Inicializando pago con Visa...");
  }

  @Override
  protected void startPayment(double amount) {
    System.out.println("Pagando $" + amount + " con Visa...");
  }

  @Override
  protected void endPayment() {
    System.out.println("Pago finalizado en servidores Visa.");
  }
}
