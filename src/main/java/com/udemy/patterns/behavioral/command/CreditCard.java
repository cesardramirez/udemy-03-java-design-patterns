package com.udemy.patterns.behavioral.command;

/**
 * Receiver: CreditCard
 * Acá vendría la definición de los diferentes comandos a usar.
 */
public class CreditCard {

  public void sendPinNumberToCustomer() {
    System.out.println("El pin number ha sido enviado al cliente.");
  }

  public void sendSMSToCustomerActivate() {
    System.out.println("Enviado SMS al cliente informando que su tarjeta ha sido activada. Ponte en contacto si no la has recibido.");
  }

  public void activate() {
    System.out.println("La tarjeta ha sido activada.");
  }

  public void desactivate() {
    System.out.println("La tarjeta ha sido desactivada.");
  }

  public void sendSMSToCustomerDeactivate() {
    System.out.println("Enviado SMS al cliente informando de que su tarjeta ha sido desactivada.");
  }
}
