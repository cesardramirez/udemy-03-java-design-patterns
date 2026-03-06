package com.udemy.patterns.creational.prototype;

/**
 * ConcretePrototype1: Visa
 */
public class Visa implements PrototypeCard {

  private String name;

  // Constructor para crear el objeto original
  public Visa(String name) {
    this.name = name;
  }

  // Constructor de copia
  public Visa(Visa other) {
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
    System.out.println("Tarjeta VISA: " + name);
  }

  @Override
  public PrototypeCard copy() {
    System.out.println("Clonando tarjeta Visa...");
    return new Visa(this);
  }
}
