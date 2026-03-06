package com.udemy.patterns.creational.prototype;

/**
 * Prototype: PrototypeCard
 * La clase Cloneable, el método clone, permite hacer una copia miembro a miembro de las instancias de dicha clase.
 */
public interface PrototypeCard extends Cloneable {
  void showCard();

  PrototypeCard clone() throws CloneNotSupportedException;
}
