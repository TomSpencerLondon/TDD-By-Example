package guru.springframework;

public class Dollar {

  private final int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  public void times(int amount) {
    throw new UnsupportedOperationException("Implement me!");
  }
}
