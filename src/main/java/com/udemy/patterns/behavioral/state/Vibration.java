package com.udemy.patterns.behavioral.state;

/**
 * ConcreteStateB: Vibration
 */
public class Vibration implements MobileAlertState {

  @Override
  public void alert(MobileAlertStateContext context) {
    System.out.println("Vibrando... Vibrando...");
  }
}
