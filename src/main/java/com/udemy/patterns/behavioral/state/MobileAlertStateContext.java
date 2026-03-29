package com.udemy.patterns.behavioral.state;

/**
 * Context: MobileAlertStateContext
 */
public class MobileAlertStateContext {

  private MobileAlertState currentState;

  public MobileAlertStateContext() {
    this.currentState = Sound.INSTANCE;
  }

  public void setState(MobileAlertState state) {
    if (state == null) {
      throw new  IllegalArgumentException("State may not be null");
    }
    this.currentState = state;
  }

  public void alert() {
    currentState.alert(this);
  }

  public String getCurrentState() {
    return currentState.getClass().getSimpleName();
  }
}
