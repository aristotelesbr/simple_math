package br.com.aristoteles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class ArraysCompareTest {
  @Test
  void test() {
    int[] numbers = { 12, 3, 4, 1 };
    int[] expectedArray = { 1, 3, 4, 12 };

    Arrays.sort(numbers);

    assertArrayEquals(numbers, expectedArray);
  }
}
