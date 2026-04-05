package com.udemy.patterns.structural.bridge;

/**
 * ConcreteImplementor: SecurePayment
 * Implementa la lógica real.
 * Ejecuta el pago y son intercambiables con los ConcreteImplementor existentes.
 */
public class SecurePayment implements PaymentSecurity {

  @Override
  public void processPayment() {
    System.out.println("Procesando pago CON seguridad avanzada...");
  }
}
