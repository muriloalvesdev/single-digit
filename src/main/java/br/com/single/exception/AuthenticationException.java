package br.com.single.exception;

public class AuthenticationException extends RuntimeException {
  public AuthenticationException() {
    super("UNAUTHORIZED");
  }
}
