/* White-Box Testing. */

package shubham;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void testDivide() {
        // White-box testing: We consider code branches and edge cases.
        double result = MathUtils.divide(10, 2);
        assertEquals(5.0, result, 0.001); // Expected result is 5.0

        // Testing division by zero (edge case)
        try {
            MathUtils.divide(10, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero.", e.getMessage());
        }
    }
}
