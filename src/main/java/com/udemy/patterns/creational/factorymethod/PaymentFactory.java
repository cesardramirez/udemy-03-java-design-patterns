package com.udemy.patterns.creational.factorymethod;

/**
 * ConcreteCreator: PaymentFactory.
 */
public class PaymentFactory {
  public static Payment buildPayment(TypePayment typePayment) {
    return switch (typePayment) {
      case CARD -> new CardPayment();
      case GOOGLE -> new GooglePayment();
    };
  }
}
