package com.udemy.patterns.behavioral.state;

/**
 * Context: MobileAlertStateContext
 */
public class MobileAlertStateContext {

  private MobileAlertState currentState;

  public MobileAlertStateContext() {
    this.currentState = new Sound();
  }

  public void setCurrentState(MobileAlertState state) {
    this.currentState = state;
  }

  public void alert() {
    this.currentState.alert(this);
  }
}
