package com.udemy;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MainTest {

  @Test
  void example() {
    String text = "Hello World!";
    assertEquals("Hello World!", text);
  }
}