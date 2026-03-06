package com.udemy.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Factoría de Prototype.
 * Se cargan las tarjetas iniciales con un name por defecto, pero, al momento de clonarlas
 * con getInstance() hará una copia del objeto, pero limitado al acceso de atributos definido en PrototypeCard.
 */
public class PrototypeFactory {

  private static final Map<TypeCard, PrototypeCard> prototypes = new HashMap<>();

  public static PrototypeCard getInstance(TypeCard typeCard) throws CloneNotSupportedException {
    PrototypeCard prototype = prototypes.get(typeCard);

    if (prototype == null) {
      throw new IllegalArgumentException("No prototype found for " + typeCard);
    }

    return prototype.clone();
  }

  static {
    Visa visa = new Visa();
    visa.setName("Visa con número 4422");
    prototypes.put(TypeCard.VISA, visa);

    Amex amex = new Amex();
    amex.setName("Amex con número 3200");
    prototypes.put(TypeCard.AMEX, amex);
  }
}
