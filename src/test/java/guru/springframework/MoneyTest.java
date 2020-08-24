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
// Common Equals (DONE)
// Common times (DONE)
// Compare francs with dollars (DONE)
// Currency (DONE)
// Delete testFrancMultiplication

public class MoneyTest {

  @Test
  void multiplication() {
    Money five = Money.dollar(5);
    assertEquals(Money.dollar(10), five.times(2));
    assertEquals(Money.dollar(15), five.times(3));

    Money fiveFranc = Money.franc(5);
    assertEquals(Money.franc(10), fiveFranc.times(2));
  }

  @Test
  void equality() {
    assertEquals(Money.dollar(5), Money.dollar(5));
    assertNotEquals(Money.franc(5), Money.franc(8));
    assertEquals(Money.franc(5), Money.franc(5));
    assertNotEquals(Money.dollar(5), Money.franc(5));
  }

  @Test
  void currency() {
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("CHF", Money.franc(1).currency());
  }

  @Test
  void simple_addition() {
    Money five = Money.dollar(5);
    Expression sum = five.plus(five);
    Bank bank = new Bank();
    Money reduced = bank.reduce(sum, "USD");
    assertEquals(Money.dollar(10), reduced);
  }
}
