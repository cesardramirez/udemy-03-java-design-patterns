package com.udemy.patterns.creational.prototype;

import java.util.Map;

/**
 * Factoría de Prototype.
 * Se crean las tarjetas de crédito originales para que, al momento de clonarlas
 * con getInstance() hará una copia del objeto, pero limitado al acceso de atributos definido en PrototypeCard.
 */
public class PrototypeFactory {

  private static final Map<TypeCard, PrototypeCard> PROTOTYPES = Map.of(
          TypeCard.VISA, new Visa("Visa 4422"),
          TypeCard.AMEX, new Amex("Amex 3200")
  );

  public static PrototypeCard getInstance(TypeCard typeCard) {
    PrototypeCard prototype = PROTOTYPES.get(typeCard);

    if (prototype == null) {
      throw new IllegalArgumentException("No prototype found for " + typeCard);
    }

    return prototype.copy();
  }
}
