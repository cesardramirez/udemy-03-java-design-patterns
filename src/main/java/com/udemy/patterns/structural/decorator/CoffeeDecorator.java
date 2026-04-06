package com.udemy.patterns.structural.decorator;

/**
 * Decorator: CoffeeDecorator
 * Envuelve un Component (Referencia a Coffee).
 * Implementa la misma interfaz.
 * Base para decoradores concretos.
 * Maneja la composición en lugar de herencia.
 */
public abstract class CoffeeDecorator implements Coffee {

  protected Coffee coffee;

  public CoffeeDecorator(Coffee coffee) {
    this.coffee = coffee;
  }
}
