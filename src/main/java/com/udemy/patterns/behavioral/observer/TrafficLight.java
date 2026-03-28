package com.udemy.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteSubject: TrafficLight
 * Al cambiar el estado se notifica a todos los observadores (hace un update en cada observador).
 */
public class TrafficLight implements Subject {

  private final List<Observer> observers = new ArrayList<>();
  private ColorTrafficLight status;

  public void setStatus(ColorTrafficLight status) {
    this.status = status;
    notifyObservers();
  }

  @Override
  public void attach(Observer o) {
    observers.add(o);
  }

  @Override
  public void detach(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notifyObservers() {
    for (Observer o : observers) {
      o.update(status);
    }
  }
}
