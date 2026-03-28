package com.udemy.patterns.behavioral.observer;

/**
 * ConcreteObserverB: Driver
 */
public class Driver implements Observer {

  @Override
  public void update(ColorTrafficLight status) {
    switch (status) {
      case GREEN -> System.out.println("Semáforo Verde para el Carro: Conductor SI puede pasar.");
      case RED -> System.out.println("Semáforo Rojo para el Carro: Conductor NO puede pasar.");
      case YELLOW -> System.out.println("Semáforo Amarillo para el Carro: Conductor AÚN NO puede pasar.");
    }
  }
}
