package com.udemy.patterns.behavioral.state;

/**
 * ConcreteStateC: Silent
 */
public class Silent implements MobileAlertState {

  public static final Silent INSTANCE = new Silent();

  @Override
  public void alert(MobileAlertStateContext context) {
    System.out.println("Modo silencio, pantalla iluminada...");
  }
}
