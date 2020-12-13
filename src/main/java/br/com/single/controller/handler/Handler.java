package br.com.single.controller.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import br.com.single.exception.AuthenticationException;
import br.com.single.service.DigitService;


@Component
public class Handler {
  private DigitService service;
  private String authentication;

  Handler(DigitService service, @Value("${api.authentication}") String authentication) {
    this.service = service;
    this.authentication = authentication;
  }

  public Long convertDigit(String digit, String quantity, String authentication) {
    checkAuthentication(authentication);
    return this.service.convert(digit, quantity);
  }

  private void checkAuthentication(String authentication) {
    if (!this.authentication.equals(authentication)) {
      throw new AuthenticationException();
    }
  }
}
