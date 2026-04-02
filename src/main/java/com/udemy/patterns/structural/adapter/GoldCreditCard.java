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
}
