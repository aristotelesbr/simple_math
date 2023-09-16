package br.com.aristoteles;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Simple Math Test")
class SimpleMathTest {
  @Test
  @DisplayName("When sum two number")
  void sumTest() {
    SimpleMath math = new SimpleMath();
    Double result = math.sum(1.2D, 2.3D);
    double expected = 3.5D;

    assertEquals(expected, result,
      () -> "expected: " + expected + " but was: " + result);
  }

  @Test
  @DisplayName("When subtraction two number")
  void subtractionTest() {
    SimpleMath math = new SimpleMath();
    Double result = math.subtraction(5, 2);
    double expected = 3;

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("When multiplication two number")
  void multiplicationTest() {
    SimpleMath math = new SimpleMath();
    double result = math.multiplication(2, 2);
    double expected = 4;

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("When division two number")
  void divisionTest() {
    SimpleMath math = new SimpleMath();
    double result = math.division(4, 2);
    double expected = 2;

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("when division by zero")
  void divisionByZeroTest() {
    SimpleMath math = new SimpleMath();
    double result = math.division(4, 0);
    double expected = Double.POSITIVE_INFINITY;

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("when sum two number")
  void test() {
    SimpleMath ctx = new SimpleMath();
    SimpleMath calc = new SimpleMath();

    ctx.Test("when sum two number", () -> {
      double result = calc.sum(1, 1);
      assertEquals(3, result);
    });
  }
}