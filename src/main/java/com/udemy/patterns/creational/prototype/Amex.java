package com.udemy.patterns.creational.prototype;

/**
 * ConcretePrototype2: Amex
 */
public class Amex implements PrototypeCard {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void showCard() {
    System.out.println("Tarjeta Américan Express");
  }

  @Override
  public PrototypeCard clone() throws CloneNotSupportedException {
    System.out.println("Clonando tarjeta Amex...");
    return (Amex) super.clone();
  }
}
