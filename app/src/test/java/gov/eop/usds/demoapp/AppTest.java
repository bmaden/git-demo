package gov.eop.usds.demoapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void simpleAddWorks() {
        final App app = new App();
        Integer sum = app.add(2, 2);
        assertEquals(Integer.valueOf(4), sum);
    }
}
