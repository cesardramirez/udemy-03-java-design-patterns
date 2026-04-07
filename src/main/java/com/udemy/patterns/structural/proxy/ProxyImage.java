package com.udemy.patterns.structural.proxy;

/**
 * Proxy: ProxyImage
 * Controla el acceso al objeto real.
 * En este caso, retrasa la creación (lazy) de la imagen para ser visualizada.
 * Este rol también puede: retrasar creación (lazy), validar accesos, cachear, registrar logs.
 */
public class ProxyImage implements Image {

  private RealImage realImage;
  private final String fileName;

  public ProxyImage(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void display() {
    if (realImage == null) {
      realImage = new RealImage(fileName);  // lazy loading
    }

    realImage.display();
  }
}
