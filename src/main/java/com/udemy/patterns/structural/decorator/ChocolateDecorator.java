package com.udemy.patterns.structural.decorator;

/**
 * ConcreteDecorator: SugarDecorator
 * Agrega comportamiento adicional al objeto original.
 * Delegan al objeto envuelto (Component).
 */
public class ChocolateDecorator extends CoffeeDecorator {

  public ChocolateDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getDescription() {
    return coffee.getDescription() + ", chocolate";
  }

  @Override
  public double cost() {
    return coffee.cost() + 2.0;
  }
}
