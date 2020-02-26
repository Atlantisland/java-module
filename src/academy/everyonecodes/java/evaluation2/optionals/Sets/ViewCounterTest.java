package academy.everyonecodes.java.evaluation2.optionals.Sets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ViewCounterTest {
    ViewCounter counter = new ViewCounter();


    @Test
    void testNoIPAddress() {
        counter.addViewerIPAddress("");
        int result = counter.countUniqueViews();
        int expected = 0;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void test1IPAddress() {
        counter.addViewerIPAddress("IP1");
        int result = counter.countUniqueViews();
        int expected = 1;
        Assertions.assertEquals(expected, result);
    }

}