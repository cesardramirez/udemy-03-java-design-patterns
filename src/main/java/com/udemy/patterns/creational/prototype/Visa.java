package com.udemy.patterns.creational.prototype;

/**
 * ConcretePrototype1: Visa
 */
public class Visa implements PrototypeCard {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void showCard() {
    System.out.println("Tarjeta VISA");
  }

  @Override
  public PrototypeCard clone() throws CloneNotSupportedException {
    System.out.println("Clonando tarjeta Visa...");
    return (Visa) super.clone();
  }
}
