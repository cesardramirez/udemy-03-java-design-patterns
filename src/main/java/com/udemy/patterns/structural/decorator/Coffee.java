package com.udemy.patterns.structural.decorator;

/**
 * Component: Coffee
 * Interfaz común. Base para todos (componentes y decoradores), permite tratarlos igual.
 */
public interface Coffee {
  String getDescription();

  double cost();
}
