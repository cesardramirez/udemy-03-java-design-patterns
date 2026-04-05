package com.udemy.patterns.structural.bridge;

/**
 * ConcreteImplementor: UnsecureCreditCard
 */
public class UnsecureCreditCard implements ICreditCard {

  @Override
  public void makePayment() {
    System.out.println("Pago realizado SIN seguridad.");
  }
}
