package com.udemy.patterns.structural.adapter;

/**
 * Adaptee: Secure
 * Interfaz existente en el sistema que es incompatible con Payment.
 */
public interface Secure {
  void securePay();
}
