package com.udemy;

import com.udemy.patterns.behavioral.command.ActivateCommand;
import com.udemy.patterns.behavioral.command.Command;
import com.udemy.patterns.behavioral.command.CreditCard;
import com.udemy.patterns.behavioral.command.CreditCardInvoker;
import com.udemy.patterns.behavioral.command.DeactivateCommand;
import com.udemy.patterns.behavioral.iterator.CardCollection;
import com.udemy.patterns.behavioral.iterator.CardList;
import com.udemy.patterns.behavioral.iterator.MyIterator;
import com.udemy.patterns.behavioral.mediator.Colleague;
import com.udemy.patterns.behavioral.mediator.Mediator;
import com.udemy.patterns.behavioral.mediator.User;
import com.udemy.patterns.behavioral.mediator.ChatMediator;
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
    //testCommand();
    //testIterator();
    testMediator();
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

  private static void testIterator() {
    com.udemy.patterns.behavioral.iterator.Card[] cards = {
            new com.udemy.patterns.behavioral.iterator.Card("Visa"),
            new com.udemy.patterns.behavioral.iterator.Card("MasterCard"),
            new com.udemy.patterns.behavioral.iterator.Card("Amex"),
            new com.udemy.patterns.behavioral.iterator.Card("Google Card"),
            new com.udemy.patterns.behavioral.iterator.Card("Apple Card")
    };

    CardCollection collection = new CardList(cards);
    MyIterator<com.udemy.patterns.behavioral.iterator.Card> iterator = collection.iterator();

    while (iterator.hasNext()) {
      com.udemy.patterns.behavioral.iterator.Card card = iterator.next();
      System.out.println(card.getType());
    }
  }

  private static void testMediator() {
    Mediator mediator = new ChatMediator();

    Colleague user1 = new User(mediator, "User1");
    Colleague user2 = new User(mediator, "User2");
    Colleague user3 = new User(mediator, "User3");

    mediator.register(user1);
    mediator.register(user2);
    mediator.register(user3);

    user1.send("Hola a todos");
    System.out.println("---");
    user2.send("Hola user1, soy user2");
    System.out.println("---");
    user3.send("Si, aparece que eres user2 en el mensaje");
    System.out.println("---");
    user2.send("Vale");
  }
}
