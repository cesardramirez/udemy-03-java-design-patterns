package com.udemy.patterns.structural.bridge;

/**
 * Abstraction: CreditCard
 * Contiene el Implementor (PaymentSecurity).
 * Define el contrato en alto nivel.
 * Sabe el qué hacer, pero no sabe cómo se ejecuta el pago.
 */
public abstract class CreditCard {

  protected PaymentSecurity paymentSecurity;

  public CreditCard(PaymentSecurity paymentSecurity) {
    this.paymentSecurity = paymentSecurity;
  }

  abstract public void makePayment();
}
