package br.com.single.controller.handler.exeception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import br.com.single.controller.handler.resource.ApiException;
import br.com.single.exception.AuthenticationException;

@ControllerAdvice
public class HandlerException extends ResponseEntityExceptionHandler {

  private static final HttpStatus UNAUTHORIZED = HttpStatus.UNAUTHORIZED;

  @ExceptionHandler(AuthenticationException.class)
  public ResponseEntity<ApiException> handleEmailNotFoundException(
      AuthenticationException exception) {
    return ResponseEntity.status(UNAUTHORIZED)
        .body(createResponse(exception.getMessage(), UNAUTHORIZED.value()));
  }

  private ApiException createResponse(String message, int httpValue) {
    return new ApiException(message, httpValue);
  }

}
