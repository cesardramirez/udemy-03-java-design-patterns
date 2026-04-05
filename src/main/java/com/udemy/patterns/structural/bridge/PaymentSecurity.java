package com.udemy.patterns.structural.bridge;

/**
 * Implementor: PaymentSecurity
 * Interfaz de bajo nivel (cómo se ejecuta el pago).
 * Desconoce las tarjetas. Sòlo define el comportamiento técnico.
 */
public interface PaymentSecurity {
  void processPayment();
}
