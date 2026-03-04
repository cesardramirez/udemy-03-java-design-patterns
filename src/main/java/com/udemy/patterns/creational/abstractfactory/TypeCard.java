package com.udemy.patterns.creational.abstractfactory;

public enum TypeCard {
  VISA,
  MASTERCARD;

  public static TypeCard fromString(String value) {
    if (value == null || value.isBlank()) {
      throw new IllegalArgumentException("Invalid card type");
    }

    try {
      return TypeCard.valueOf(value.trim().toUpperCase());
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException("Invalid card type: " + value);
    }
  }
}
