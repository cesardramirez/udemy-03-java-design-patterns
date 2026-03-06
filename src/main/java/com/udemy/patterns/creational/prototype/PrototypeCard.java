package com.udemy.patterns.creational.prototype;

/**
 * Prototype: PrototypeCard
 * El método copy() hará la copia miembro a miembro de las instancias de dicha clase.
 */
public interface PrototypeCard {
  void showCard();

  PrototypeCard copy();
}
