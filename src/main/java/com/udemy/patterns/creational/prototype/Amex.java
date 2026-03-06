package com.udemy.patterns.creational.prototype;

/**
 * ConcretePrototype2: Amex
 */
public class Amex implements PrototypeCard {

  private String name;

  // Constructor para crear el objeto original
  public Amex(String name) {
    this.name = name;
  }

  // Constructor de copia
  public Amex(Amex other) {
    this.name = other.name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void showCard() {
    System.out.println("Tarjeta Américan Express: " + name);
  }

  @Override
  public PrototypeCard copy() {
    System.out.println("Clonando tarjeta Amex...");
    return new Amex(this);
  }
}
