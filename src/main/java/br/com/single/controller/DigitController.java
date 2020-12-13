package br.com.single.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.single.controller.handler.Handler;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@RestController
@RequestMapping("api/digit")
class DigitController {

  private final Handler handler;

  @GetMapping("{digit}/{quantity}/{authentication}")
  public ResponseEntity<Long> convert(@PathVariable(name = "digit") String digit,
      @PathVariable(name = "quantity", required = false) String quantity,
      @PathVariable(name = "authentication") String authentication) {
    return ResponseEntity.ok(this.handler.convertDigit(digit, quantity, authentication));
  }

}
