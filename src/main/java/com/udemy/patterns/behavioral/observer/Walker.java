package com.udemy.patterns.behavioral.observer;

/**
 * ConcreteObserverA: Walker
 */
public class Walker implements Observer {

  @Override
  public void update(ColorTrafficLight status) {
    if (status == ColorTrafficLight.GREEN) {
      System.out.println("Semáforo Rojo para el Peatón: Peatón NO puede pasar.");
    } else if (status == ColorTrafficLight.RED) {
      System.out.println("Semáforo Verde para el Peatón: Peatón SI puede pasar.");
    }
  }
}
