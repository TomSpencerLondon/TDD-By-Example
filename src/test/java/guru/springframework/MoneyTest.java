package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

// $5 + 10 CHF = $10 (with rate of 2:1)
// $5 * 2 = $10 (DONE)
// Make “amount” private (DONE)
// Dollar side effects? (DONE)
// Equals (DONE)
// HashCode
// Equal null
// Money Rounding?
// 5 CHF * 2 = 10 CHF (DONE)
// Dollar / Franc Duplication
// Common Equals
// Common times
// Compare francs with dollars

public class MoneyTest {

  @Test
  void dollar_multiplication() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    assertEquals(new Dollar(10), product);
    product = five.times(3);
    assertEquals(new Dollar(15), product);
  }

  @Test
  void franc_multiplication() {
    Franc five = new Franc(5);
    Franc product = five.times(2);
    assertEquals(new Franc(10), product);
    product = five.times(3);
    assertEquals(new Franc(15), product);
  }

  @Test
  void equality() {
    assertEquals(new Dollar(5), new Dollar(5));
    assertNotEquals(new Dollar(5), new Dollar(8));
    assertNotEquals(new Dollar(5), new Franc(5));
  }
}
