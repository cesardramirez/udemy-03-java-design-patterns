package com.udemy.patterns.creational.abstractfactory;

import com.udemy.patterns.creational.abstractfactory.factory.AbstractFactory;

public class FactoryProvider {
  public static <T> AbstractFactory<T> getFactory(Class<? extends AbstractFactory<T>> factoryClass) {
    try {
      return factoryClass.getDeclaredConstructor().newInstance();
    } catch (Exception e) {
      throw new RuntimeException("Could not create factory", e);
    }
  }
}
