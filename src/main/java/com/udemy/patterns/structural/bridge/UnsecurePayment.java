package com.udemy.patterns.structural.bridge;

/**
 * ConcreteImplementor: UnsecurePayment
 * Define el contrato en alto nivel. Implementa la lógica real.
 * Ejecuta el pago y son intercambiables con los ConcreteImplementor existentes.
 */
public class UnsecurePayment implements PaymentSecurity {

  @Override
  public void processPayment() {
    System.out.println("Procesando pago SIN seguridad...");
  }
}
