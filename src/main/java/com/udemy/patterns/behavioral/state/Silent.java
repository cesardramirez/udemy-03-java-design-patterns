package com.udemy.patterns.behavioral.state;

/**
 * ConcreteStateC: Silent
 */
public class Silent implements MobileAlertState {

  @Override
  public void alert(MobileAlertStateContext context) {
    System.out.println("Modo silencio, pantalla iluminada...");
  }
}
