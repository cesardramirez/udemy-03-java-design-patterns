package com.udemy.patterns.structural.decorator;

/**
 * ConcreteComponent: SimpleCoffee
 * Objeto base u original. Implementa el comportamiento base. Sin decoraciones.
 */
public class SimpleCoffee implements Coffee {

  @Override
  public String getDescription() {
    return "Café simple";
  }

  @Override
  public double cost() {
    return 5.0;
  }
}
