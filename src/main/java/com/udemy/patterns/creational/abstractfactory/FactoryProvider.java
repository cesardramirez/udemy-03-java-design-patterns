package com.udemy.patterns.creational.abstractfactory;

import com.udemy.patterns.creational.abstractfactory.factory.AbstractFactory;

import java.util.function.Supplier;

/**
 * FactoryProvider.
 * Define cuál será la factoría a crear según el tipo de clase reciba (CardFactory o PaymentMethodFactory).
 * Devuelve un ConcreteFactory, una nueva instancia (objeto).
 */
public class FactoryProvider {
  public static <T> AbstractFactory<T> getFactory(Supplier<AbstractFactory<T>> supplier) {
    return supplier.get();
  }
}
