package com.udemy.patterns.behavioral.chainofresponsibility;

/**
 * Handler: ApproveLoanHandler
 */
public interface ApproveLoanHandler {

  void setNext(ApproveLoanHandler next);

  void handleRequest(int totalLoan);
}
