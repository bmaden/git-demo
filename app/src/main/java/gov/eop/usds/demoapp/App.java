package gov.eop.usds.demoapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger log = LogManager.getLogger(App.class);

    public String getGreeting() {
        return "Hello World!";
    }

    public Integer add(final Integer a, final Integer b) {
        return a + b;
    }

    public static void main(String[] args) {
        log.info("Log4j enabled");
        System.out.println(new App().getGreeting());
    }
}
