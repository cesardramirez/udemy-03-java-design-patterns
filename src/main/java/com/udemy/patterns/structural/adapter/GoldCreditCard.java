package com.udemy.patterns.structural.adapter;

public class GoldCreditCard implements Secure {

  @Override
  public void payWithSecureLevelA() {
    // Tarjeta Gold no tiene Seguridad Alta.
  }

  @Override
  public void payWithSecureLevelZ() {
    System.out.println("Tarjeta Gold: Pagando con Seguridad Baja (Lvl Z)");
  }
}
