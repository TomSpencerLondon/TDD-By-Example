package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//$5 + 10 CHF = $10 (with rate of 2:1)
//    • $5 * 2 = $10
//    • Make “amount” private
//• Dollar side effects?
//    • Money Rounding?

public class MoneyTest {

  @Test
  void multiplication() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    assertEquals(10, product.amount);
    product = five.times(3);
    assertEquals(15, product.amount);
  }
}
