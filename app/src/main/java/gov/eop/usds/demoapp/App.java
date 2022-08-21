package gov.eop.usds.demoapp;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public Integer add(final Integer a, final Integer b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
