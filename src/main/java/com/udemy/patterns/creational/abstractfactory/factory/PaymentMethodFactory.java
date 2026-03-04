package com.udemy.patterns.creational.abstractfactory.factory;

import com.udemy.patterns.creational.abstractfactory.TypePaymentMethod;
import com.udemy.patterns.creational.abstractfactory.product.*;

/**
 * ConcreteFactory2: PaymentMethodFactory
 * Segunda factoría. Crea el método de pago.
 * Implementación del AbstractFactory con Product: PaymentMethod
 */
public class PaymentMethodFactory implements AbstractFactory<PaymentMethod> {
  @Override
  public PaymentMethod create(String type) {
    return switch (TypePaymentMethod.fromString(type)) {
      case CREDIT -> new Credit();
      case DEBIT -> new Debit();
    };
  }
}
