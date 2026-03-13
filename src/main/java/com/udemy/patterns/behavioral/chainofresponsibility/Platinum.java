package com.udemy.patterns.behavioral.chainofresponsibility;

/**
 * ConcreteHandler2: Platinum
 */
public class Platinum extends AbstractApproveLoanHandler {

  @Override
  public void handleRequest(int totalLoan) {
    System.out.println("Platinum credit card validation");
    if (totalLoan <= 50000) {
      // Código para conceder la tarjeta de crédito con sus condiciones.
      System.out.println("[*] Solicitud de TC para tarjeta Platinum aprobada");
    } else {
      // Si la cantidad es mayor a 50 mil, se pasará la solicitud a la siguiente tarjeta.
      nextHandler(totalLoan);
    }
  }
}
