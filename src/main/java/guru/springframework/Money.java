package guru.springframework;

public abstract class Money {
  protected int amount;
  protected abstract String currency();

  public static Money dollar(int amount) {
    return new Dollar(amount);
  }

  public static Money franc(int amount) {
    return new Franc(amount);
  }

  public abstract Money times(int multiplier);

  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;

    return amount == money.amount
        && this.getClass().equals(object.getClass());
  }
}
