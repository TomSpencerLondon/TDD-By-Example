package guru.springframework;

public class Franc extends Money {

  public Franc(int amount, String currency) {
    super(amount, currency);
  }

  @Override
  protected String currency() {
    return currency;
  }

  public Money times(int multiplier) {
    return Money.franc(amount * multiplier);
  }

}
