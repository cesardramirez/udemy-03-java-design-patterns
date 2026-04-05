package com.udemy.patterns.structural.bridge;

/**
 * ConcreteImplementor: SecureCreditCard
 */
public class SecureCreditCard implements ICreditCard {

  @Override
  public void makePayment() {
    System.out.println("Pago realizado CON seguridad.");
  }
}
