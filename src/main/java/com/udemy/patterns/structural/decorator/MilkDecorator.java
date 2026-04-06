package com.udemy.patterns.structural.decorator;

/**
 * ConcreteDecorator: MilkDecorator
 * Agrega comportamiento adicional al objeto original.
 * Delegan al objeto envuelto (Component).
 */
public class MilkDecorator extends CoffeeDecorator {

  public MilkDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getDescription() {
    return coffee.getDescription() + ", leche";
  }

  @Override
  public double cost() {
    return coffee.cost() + 1.5;
  }
}
