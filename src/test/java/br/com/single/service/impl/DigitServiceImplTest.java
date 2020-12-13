package br.com.single.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import br.com.single.service.DigitService;

@SpringBootTest
class DigitServiceImplTest {

  @Autowired
  private DigitService service;

  @Test
  void convertTestWithError() {
    Exception exception = assertThrows(Exception.class, () -> {
      this.service.convert("1A2B3", "123");
    });

    assertTrue(exception instanceof NumberFormatException);
    assertEquals(DigitServiceImpl.MESSAGE_NUMBER_INVALID, exception.getMessage());
  }

  @Test
  void convertTestWithQuantityWithSuccess() {
    long result = this.service.convert(Long.toString(9875), Long.toString(4));
    assertEquals(8, result);
  }

  @Test
  void convertTestWithSuccess() {
    long result = this.service.convert(Long.toString(9875), Long.toString(1));
    assertEquals(2, result);
  }
}
