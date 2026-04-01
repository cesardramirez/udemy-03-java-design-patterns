package com.udemy.patterns.structural.adapter;

/**
 * ConcreteAdaptee: GoldCreditCard
 * Implementación real del sistema incompatible. No se modifica, se adapta.
 */
public class GoldCreditCard implements Secure {

  @Override
  public void securePay() {
    System.out.println("Tarjeta Gold: Pago con seguridad MEDIA.");
  }

  /*@Override
  public void payWithSecureLevelA() {
    // Tarjeta Gold no tiene Seguridad Alta.
  }

  @Override
  public void payWithSecureLevelZ() {
    System.out.println("Tarjeta Gold: Pagando con Seguridad Baja (Lvl Z)");
  }*/
}
