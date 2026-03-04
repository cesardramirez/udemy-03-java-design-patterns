package com.udemy.patterns.creational.abstractfactory;

public enum TypePaymentMethod {
  CREDIT,
  DEBIT;

  public static TypePaymentMethod fromString(String value) {
    if (value == null || value.isBlank()) {
      throw new IllegalArgumentException("Invalid payment type");
    }

    try {
      return TypePaymentMethod.valueOf(value.trim().toUpperCase());
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException("Invalid payment type: " + value);
    }
  }
}
