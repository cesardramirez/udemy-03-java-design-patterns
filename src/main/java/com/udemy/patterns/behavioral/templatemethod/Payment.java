package com.udemy.patterns.behavioral.templatemethod;

/**
 * AbstractTemplate: Payment
 */
public abstract class Payment {

  // Template Method (algoritmo fijo).
  public final void makePayment(double amount) {
    initialize();

    if (validate(amount)) {
      startPayment(amount);
      endPayment();
    } else {
      System.out.println("Pago rechazado: monto inválido.");
    }
  }

  // Métodos obligatorios.
  protected abstract void initialize();
  protected abstract void startPayment(double amount);
  protected abstract void endPayment();

  // Hook (opcional)
  protected boolean validate(double amount) {
    return amount > 0;
  }
}
