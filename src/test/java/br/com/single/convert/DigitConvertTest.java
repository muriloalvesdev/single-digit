package br.com.single.convert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DigitConvertTest {
  @Test
  void convertDigitUniqueTest() {
    long result = DigitConvert.convertUniqueDigit(922875L, 1L);
    assertEquals(6, result);
  }
}
