package com.udemy.patterns.structural.composite;

/**
 * Leaf: File
 * Representa objetos simples (sin hijos).
 * Es el nodo final del árbol.
 * No contiene otros elementos.
 */
public class File implements FileComponent {

  private final String name;

  public File(String name) {
    this.name = name;
  }

  @Override
  public void showDetails() {
    System.out.println("Archivo: " + name);
  }
}
