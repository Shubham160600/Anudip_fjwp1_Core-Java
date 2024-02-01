package shubham;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathUtilsJUnitTest {

    @Test
    public void testAdditionFail() {
        int result = MathUtils.add(3, 5);
        assertEquals(10, result);
    }

    @Test
    public void testAdditionPass() {
        int result = MathUtils.add(3, 5);
        assertEquals(8, result);
    }
}