package gov.eop.usds.demoapp;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public Integer add(final Integer a, final Integer b) {
    return a + b;
  }

  public Double divide(final Double dividend, final Double divisor) {
    if (divisor == 0.) {
      throw new IllegalArgumentException("divisor must not be zero");
    }
    return dividend / divisor;
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}
