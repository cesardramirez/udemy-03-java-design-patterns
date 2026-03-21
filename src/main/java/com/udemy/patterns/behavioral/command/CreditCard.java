package com.udemy.patterns.behavioral.command;

/**
 * Receiver: CreditCard
 * Acá vendría la definición de los diferentes comandos a usar.
 */
public class CreditCard {

  public void sendPin() {
    System.out.println("El pin number ha sido enviado al cliente.");
  }

  public void activate() {
    System.out.println("La tarjeta ha sido activada.");
  }

  public void deactivate() {
    System.out.println("La tarjeta ha sido desactivada.");
  }

  public void notifyActivation() {
    System.out.println("SMS: tarjeta activada.");
  }

  public void notifyDeactivation() {
    System.out.println("SMS: tarjeta desactivada.");
  }
}
