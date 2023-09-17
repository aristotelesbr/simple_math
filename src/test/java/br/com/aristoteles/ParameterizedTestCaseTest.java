package br.com.aristoteles;


import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTestCaseTest {
  @ParameterizedTest
  @ValueSource(strings = {"Hello", "World"})
  @DisplayName("When input is Hello or World")
  void testSimpleValue(@NotNull String input) {
    assertEquals(5, input.length());
  }

  @ParameterizedTest
  @CsvSource({"Hello, 5", "World, 5"})
  @DisplayName("When input is Hello or World")
  void testSimpleValue(@NotNull String input, int expected) {
    assertEquals(expected, input.length());
  }

  @ParameterizedTest
  @ValueSource(ints = {2, 4, 100})
  @DisplayName("When input is even number")
  void testSimpleValue(int input) {
    assertEquals(0, input % 2);
  }
}
