package br.com.aristoteles;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class PerformanceTest {
  @Test
  @Timeout(value = 15, unit = TimeUnit.SECONDS)
  @DisplayName("When sort performance")
  void testSortPerformance() {
    int[] numbers = {25, 8, 21, 32, 3};

    for (int i = 0; i < 1000000; i++) {
      numbers[0] = i;
      Arrays.sort(numbers);
    }
  }
}
