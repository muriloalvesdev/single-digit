package br.com.single.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import br.com.single.convert.DigitConvert;
import br.com.single.service.DigitService;

@Service
class DigitServiceImpl implements DigitService {
  static final String MESSAGE_NUMBER_INVALID = "Check if all informed numbers is numerics";

  public long convert(String digit, String quantity) {
    checkNumber(quantity, digit);
    return DigitConvert.convertUniqueDigit(Long.valueOf(digit), Long.valueOf(quantity));
  }

  private void checkNumber(String quantity, String digit) {
    if (!checkDigit(quantity) || !checkDigit(digit)) {
      throw new NumberFormatException(MESSAGE_NUMBER_INVALID);
    }
  }

  private boolean checkDigit(String digit) {
    return StringUtils.isNumeric(digit);
  }
}
