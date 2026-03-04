package com.udemy.patterns.creational.abstractfactory.product;

/**
 * ProductB2: Credit
 */
public class Credit implements PaymentMethod {
  @Override
  public String doPayment() {
    return "Pago a Crédito";
  }
}
