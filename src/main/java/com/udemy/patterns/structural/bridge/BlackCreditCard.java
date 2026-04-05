package com.udemy.patterns.structural.bridge;

/**
 * RefinedAbstraction: BlackCreditCard
 * Define las variantes del comportamiento.
 * Agregan contexto (tipo de tarjeta) y delegan la ejecución al Implementor.
 */
public class BlackCreditCard extends CreditCard {

  public BlackCreditCard(PaymentSecurity paymentSecurity) {
    super(paymentSecurity);
  }

  @Override
  public void makePayment() {
    System.out.println("Pago con tarjeta BLACK (beneficios premium)");
    paymentSecurity.processPayment();
  }
}
