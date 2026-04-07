package com.udemy.patterns.structural.flyweight;

/**
 * Flyweight: TreeType
 * Interfaz para los objetos compartidos.
 * Usa tanto estado interno como externo.
 * SIEMPRE recibe un estado externo (no compartido) como parámetro.
 * Los atributos compartidos deben ser inmutables.
 */
public interface TreeType {
  void display(int x, int y);
}
