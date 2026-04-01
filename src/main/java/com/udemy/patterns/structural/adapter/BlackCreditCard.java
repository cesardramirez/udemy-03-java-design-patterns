package com.udemy.patterns.structural.adapter;

public class BlackCreditCard implements Secure {

  @Override
  public void payWithSecureLevelA() {
    System.out.println("Tarjeta Black: Pagando con Seguridad Alta (Lvl A)");
  }

  @Override
  public void payWithSecureLevelZ() {
    // Tarjeta Black no tiene Seguridad Baja.
  }
}
