package br.com.single.convert;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DigitConvert {
  public static final long convertUniqueDigit(long digit, Long quantity) {
    long result = checkLengthAndSum(digit);
    result = checkLengthAndSum(quantity * result);
    return result;
  }

  private static long checkLengthAndSum(long value) {
    while (checkLength(value)) {
      value = sum(value);
    }
    return value;
  }

  private static boolean checkLength(long value) {
    return Long.toString(value).length() > 1;
  }

  private static long sum(long digit) {
    long result = 0;
    while (digit != 0) {
      result += digit % 10;
      digit = digit / 10;
    }
    return result;
  }
}
