package com.udemy.patterns.creational.abstractfactory.factory;

/**
 * AbstractFactory : AbstractFactory
 * Interfaz para la creación de objetos de productos abstractos.
 * Se le indica que la clase es de tipo genérico T.
 */
public interface AbstractFactory<T> {
  T create(String type);
}
