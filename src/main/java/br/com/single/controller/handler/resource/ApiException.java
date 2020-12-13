package br.com.single.controller.handler.resource;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiException {
  private String message;
  private int status;
}
