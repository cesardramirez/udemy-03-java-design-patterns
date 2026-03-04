package com.udemy.patterns.creational.abstractfactory.product;

/**
 * ProductB1: Debit
 */
public class Debit implements PaymentMethod {
  @Override
  public String doPayment() {
    return "Pago a Débito";
  }
}
