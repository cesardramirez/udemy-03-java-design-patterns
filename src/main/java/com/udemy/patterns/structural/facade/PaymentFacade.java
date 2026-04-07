package com.udemy.patterns.structural.facade;

/**
 * Facade: PaymentFacade
 * Orquesta y simplifica el uso del sistema.
 * Punto único de entrada para el cliente.
 * Oculta la complejidad.
 * Coordina subsistemas.
 */
public class PaymentFacade {

  private final CardValidator validator;
  private final BankService bankService;
  private final PaymentProcessor processor;
  private final NotificationService notifier;

  public PaymentFacade() {
    this.validator = new CardValidator();
    this.bankService = new BankService();
    this.processor = new PaymentProcessor();
    this.notifier = new NotificationService();
  }

  public void makePayment() {
    if (!validator.validate()) {
      System.out.println("Tarjeta inválida.");
      return;
    }
    if (!bankService.hasFunds()) {
      System.out.println("Fondos insuficientes.");
      return;
    }

    processor.process();
    notifier.send();

    System.out.println("Pago realizado con éxito.");
  }
}
