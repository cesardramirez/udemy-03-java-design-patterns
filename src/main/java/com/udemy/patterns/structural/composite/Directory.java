package com.udemy.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite: Directory
 * Contiene otros componentes (Leaf o Composite)
 * Representa nodos con hijos y delega operaciones a sus hijos.
 * Maneja una estructura recursiva.
 */
public class Directory implements FileComponent {

  private final String name;
  private List<FileComponent> children = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  public void add(FileComponent child) {
    children.add(child);
  }

  public void remove(FileComponent child) {
    children.remove(child);
  }

  @Override
  public void showDetails() {
    System.out.println("Carpeta: " + name);

    for (FileComponent component : children) {
      component.showDetails();  // recursivo
    }
  }
}
