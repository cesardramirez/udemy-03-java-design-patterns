package com.udemy.patterns.behavioral.state;

/**
 * ConcreteStateB: Vibration
 */
public class Vibration implements MobileAlertState {

  public static final Vibration INSTANCE = new Vibration();

  @Override
  public void alert(MobileAlertStateContext context) {
    System.out.println("Vibrando... Vibrando...");
  }
}
