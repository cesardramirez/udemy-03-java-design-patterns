package com.udemy.patterns.structural.adapter;

/**
 * ConcreteAdaptee: BlackCreditCard
 * Implementación real del sistema incompatible. No se modifica, se adapta.
 */
public class BlackCreditCard implements Secure {

  @Override
  public void securePay() {
    System.out.println("Tarjeta Black: Pago con seguridad ALTA.");
  }

  /*@Override
  public void payWithSecureLevelA() {
    System.out.println("Tarjeta Black: Pagando con Seguridad Alta (Lvl A)");
  }

  @Override
  public void payWithSecureLevelZ() {
    // Tarjeta Black no tiene Seguridad Baja.
  }*/
}
