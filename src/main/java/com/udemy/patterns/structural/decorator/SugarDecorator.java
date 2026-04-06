package com.udemy.patterns.structural.decorator;

/**
 * ConcreteDecorator: SugarDecorator
 * Agrega comportamiento adicional al objeto original.
 * Delegan al objeto envuelto (Component).
 */
public class SugarDecorator extends CoffeeDecorator {

  public SugarDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getDescription() {
    return coffee.getDescription() + ", azúcar";
  }

  @Override
  public double cost() {
    return coffee.cost() + 0.5;
  }
}
