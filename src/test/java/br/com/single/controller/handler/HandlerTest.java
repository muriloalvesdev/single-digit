package br.com.single.controller.handler;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import br.com.single.exception.AuthenticationException;
import br.com.single.service.DigitService;

class HandlerTest {

  private Handler handler;
  private DigitService service;
  private String authentication;

  @BeforeEach
  void setUp() {
    this.service = mock(DigitService.class);
    this.authentication = "pass anything";

    this.handler = new Handler(this.service, this.authentication);
  }

  @Test
  void convertDigitWithSuccess() {
    // given
    String digit = "9875";
    String quantity = "1";

    // when
    BDDMockito.when(this.service.convert(Mockito.anyString(), Mockito.anyString())).thenReturn(2L);

    // then
    Long response = this.handler.convertDigit(digit, quantity, this.authentication);

    assertEquals(2L, response);
    verify(this.service, times(1)).convert(Mockito.anyString(), Mockito.anyString());
  }

  @Test
  void convertDigitWithError() {
    // given
    String digit = "9875";
    String quantity = "1";

    // then
    Exception exception = assertThrows(Exception.class, () -> {
      this.handler.convertDigit(digit, quantity, null);
    });

    assertTrue(exception instanceof AuthenticationException);
    assertEquals("UNAUTHORIZED", exception.getMessage());
  }

}
