package com.udemy.patterns.behavioral.observer;

/**
 * ConcreteObserverB: Driver
 */
public class Driver implements Observer {

  @Override
  public void update(TrafficLight trafficLight) {
    if (trafficLight.status.equals(ColorTrafficLight.GREEN)) {
      System.out.println("Semáforo Verde para el Carro: Conductor SI puede pasar.");
    } else if (trafficLight.status.equals(ColorTrafficLight.RED)) {
      System.out.println("Semáforo Rojo para el Carro: Conductor NO puede pasar.");
    } else if (trafficLight.status.equals(ColorTrafficLight.YELLOW)) {
      System.out.println("Semáforo Amarillo para el Carro: Conductor AÚN NO puede pasar.");
    }
  }
}
