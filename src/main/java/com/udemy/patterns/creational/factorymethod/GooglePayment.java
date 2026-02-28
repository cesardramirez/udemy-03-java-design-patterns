package com.udemy.patterns.creational.factorymethod;

/**
 * ConcreteProduct: GooglePayment.
 */
public class GooglePayment implements Payment {
  @Override
  public void doPayment() {
    System.out.println("Pagando con Google Payment");
  }
}
