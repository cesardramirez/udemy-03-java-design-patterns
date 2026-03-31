package com.udemy.patterns.behavioral.templatemethod;

/**
 * ConcreteSubClass2: PayPal
 */
public class PayPal extends Payment {

  @Override
  protected void initialize() {
    System.out.println("Inicializando pago con PayPal...");
  }

  @Override
  protected void startPayment(double amount ) {
    System.out.println("Pagando $" + amount + " con PayPal...");
  }

  @Override
  protected void endPayment() {
    System.out.println("Pago finalizado en servidores PayPal");
  }

  @Override
  protected boolean validate(double amount) {
    System.out.println("Validando pago en PayPal...");
    return amount >= 10; // PayPal requiere mínimo
  }
}
