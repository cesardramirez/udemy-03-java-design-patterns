package com.udemy;

import com.udemy.patterns.behavioral.command.*;
import com.udemy.patterns.creational.abstractfactory.FactoryProvider;
import com.udemy.patterns.creational.abstractfactory.TypeCard;
import com.udemy.patterns.creational.abstractfactory.TypePaymentMethod;
import com.udemy.patterns.creational.abstractfactory.factory.AbstractFactory;
import com.udemy.patterns.creational.abstractfactory.factory.CardFactory;
import com.udemy.patterns.creational.abstractfactory.factory.PaymentMethodFactory;
import com.udemy.patterns.creational.abstractfactory.product.Card;
import com.udemy.patterns.creational.abstractfactory.product.PaymentMethod;
import com.udemy.patterns.creational.factorymethod.Payment;
import com.udemy.patterns.creational.factorymethod.PaymentFactory;
import com.udemy.patterns.creational.factorymethod.TypePayment;
import com.udemy.patterns.creational.prototype.PrototypeCard;
import com.udemy.patterns.creational.prototype.PrototypeFactory;
import com.udemy.patterns.creational.prototype.Visa;

import java.time.YearMonth;


public class Main {
  public static void main(String[] args) {
    // ---- Creational Patterns ----
    //testFactoryMethod();
    //testAbstractFactory();
    //testBuilder();
    //testPrototype();
    //testSingleton();

    // ---- Behavioral Patterns ----
    //testChainOfResponsibility();
    testCommand();
  }

  private static void testFactoryMethod() {
    Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
    payment.doPayment();
  }

  private static void testAbstractFactory() {
    AbstractFactory<Card> concreteFactory1 = FactoryProvider.getFactory(CardFactory::new);
    Card productA1 = concreteFactory1.create(TypeCard.VISA.toString());

    AbstractFactory<PaymentMethod> concreteFactory2 = FactoryProvider.getFactory(PaymentMethodFactory::new);
    PaymentMethod productB2 = concreteFactory2.create(TypePaymentMethod.CREDIT.toString());

    System.out.println("Tarjeta de crédito " + productA1.getCardType() + " con número " + productA1.getNumber() + " de tipo " + productB2.doPayment());
  }

  private static void testBuilder() {
    com.udemy.patterns.creational.builder.Card card1 =
            new com.udemy.patterns.creational.builder.Card
                    .Builder("VISA", "4242 4242 4242 4242")
                    .holderName("César")
                    .expiration(YearMonth.of(2030, 12))
                    .credit(true)
                    .build();

    System.out.println(card1);

    com.udemy.patterns.creational.builder.Card card2 =
            new com.udemy.patterns.creational.builder.Card
                    .Builder("AMEX", "3400 0000 0000 0000")
                    .build();

    System.out.println(card2);
  }

  private static void testPrototype() {
    Visa visaClone = (Visa) PrototypeFactory.getInstance(com.udemy.patterns.creational.prototype.TypeCard.VISA);
    visaClone.setName("Visa clonada 9999");
    visaClone.showCard();

    PrototypeCard amexClone = PrototypeFactory.getInstance(com.udemy.patterns.creational.prototype.TypeCard.AMEX);
    amexClone.showCard();
  }

  private static void testSingleton() {
    com.udemy.patterns.creational.singleton.Card card1 = com.udemy.patterns.creational.singleton.Card.INSTANCE;
    card1.setCardNumber("1234 1234 1234 1234");

    com.udemy.patterns.creational.singleton.Card card2 = com.udemy.patterns.creational.singleton.Card.INSTANCE;

    System.out.println(card2.getCardNumber()); // card1 y card2 son el mismo objeto.
  }

  private static void testChainOfResponsibility() {
    com.udemy.patterns.behavioral.chainofresponsibility.Card card = new com.udemy.patterns.behavioral.chainofresponsibility.Card();
    card.creditCardRequest(100000);
  }

  private static void testCommand() {
    CreditCard card = new CreditCard();
    CreditCardInvoker invoker = new CreditCardInvoker();

    Command activate = new ActivateCommand(card);
    Command deactivate = new DeactivateCommand(card);

    invoker.run(activate);

    System.out.println("---- UNDO ----");
    invoker.undo();

    System.out.println("\n--------------\n");

    invoker.run(deactivate);

    System.out.println("---- UNDO ----");
    invoker.undo();
  }
}
