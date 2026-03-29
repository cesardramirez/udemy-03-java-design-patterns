package com.udemy.patterns.behavioral.state;

/**
 * ConcreteStateA: Sound
 */
public class Sound implements MobileAlertState {

  @Override
  public void alert(MobileAlertStateContext context) {
    System.out.println("Ring... Ring...");
  }
}
