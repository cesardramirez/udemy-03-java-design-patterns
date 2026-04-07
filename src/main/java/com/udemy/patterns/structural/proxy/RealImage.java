package com.udemy.patterns.structural.proxy;

/**
 * RealSubject: RealImage
 * Contiene la lógica real. Objeto pesado o sensible.
 */
public class RealImage implements Image {

  private final String fileName;

  public RealImage(String fileName) {
    this.fileName = fileName;
    loadFromDisk();  // operación costosa
  }

  private void loadFromDisk() {
    System.out.println("Cargando imagen desde disco: " + fileName);
  }

  @Override
  public void display() {
    System.out.println("Mostrando imagen: " + fileName);
  }
}
