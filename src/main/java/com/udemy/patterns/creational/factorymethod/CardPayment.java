package com.udemy.patterns.creational.factorymethod;

/**
 * ConcreteProduct: CardPayment.
 */
public class CardPayment implements Payment {
  @Override
  public void doPayment() {
    System.out.println("Pagando con Tarjeta de Crédito");
  }
}
