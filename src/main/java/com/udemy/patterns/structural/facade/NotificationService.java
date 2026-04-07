package com.udemy.patterns.structural.facade;

/**
 * Subsystem: NotificationService
 * Clase interna del sistema. Se implementa la lógica de negocio real.
 * Clase independiente que no conoce el facade y contiene la complejidad.
 */
public class NotificationService {

  void send() {
    System.out.println("Enviando notificación...");
  }
}
