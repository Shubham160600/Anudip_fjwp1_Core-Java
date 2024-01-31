/* Black box & White box testing. */

package shubham;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        // Black-box testing: We only care about the input and output.
        int result = Calculator.add(2, 3);
        assertEquals(5, result); // Expected result is 5
    }
}
