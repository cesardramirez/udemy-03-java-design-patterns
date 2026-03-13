package com.udemy.patterns.behavioral.chainofresponsibility;

/**
 * ConcreteHandler1: Gold
 */
public class Gold extends AbstractApproveLoanHandler {

  @Override
  public void handleRequest(int totalLoan) {
    System.out.println("Gold credit card validation");
    if (totalLoan <= 10000) {
      // Código para conceder la tarjeta de crédito con sus condiciones.
      System.out.println("[*] Solicitud de TC para tarjeta Gold aprobada");
    } else {
      // Si la cantidad es mayor a 10 mil, se pasará la solicitud a la siguiente tarjeta.
      nextHandler(totalLoan);
    }
  }
}
