package gov.eop.usds.demoapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void divideWorks() {
        final App app = new App();
        Double result = app.divide(10., 2.);
        assertEquals(Double.valueOf(5), result);
    }

    @Test public void divideThrows() {
        final App app = new App();
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> app.divide(1., 0.));
        assertEquals("divisor must not be zero", e.getMessage());
    }

    @Test public void simpleAddWorks() {
        final App app = new App();
        Integer sum = app.add(2, 2);
        assertEquals(Integer.valueOf(4), sum);
    }
}
