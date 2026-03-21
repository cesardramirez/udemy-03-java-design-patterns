package com.udemy.patterns.behavioral.command;

/**
 * Command: Command
 */
public interface Command {
  void execute();

  default void undo() {
    throw new UnsupportedOperationException("Undo not supported");
  }
}
