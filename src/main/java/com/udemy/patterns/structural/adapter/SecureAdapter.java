package com.udemy.patterns.structural.adapter;

/**
 * Adapter: SecureAdapter
 * Convierte pay() en securePay(), no contiene lógica de negocio, sólo se adapta.
 */
public class SecureAdapter implements Payment {

  private final Secure secure;

  public SecureAdapter(Secure secure) {
    this.secure = secure;
  }

  @Override
  public void pay() {
    secure.securePay(); // adaptación
  }
}
