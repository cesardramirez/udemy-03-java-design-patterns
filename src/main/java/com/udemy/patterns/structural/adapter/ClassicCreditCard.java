package com.udemy.patterns.structural.adapter;

/**
 * ConcreteTarget: ClassicCreditCard
 * Implementación directa sin necesidad de adaptación (seguridad definida en Secure).
 */
public class ClassicCreditCard implements Payment {

  @Override
  public void pay() {
    System.out.println("Tarjeta Classic: Pago SIN seguridad.");
  }
}
