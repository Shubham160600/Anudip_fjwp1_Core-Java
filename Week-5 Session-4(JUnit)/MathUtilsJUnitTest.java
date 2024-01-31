/* Assertions. */

package shubham;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

public class MathUtilsJUnitTest {

    @Test
    void testEquals() {
        assertEquals(5, 2 + 3);
    }

    @Test
    void testTrueAndFalse() {
        assertTrue(10 > 5);
        assertFalse(5 > 10);
    }

    @Test
    void testNullAndNotNull() {
        String value = null;
        assertNull(value);

        String name = "JUnit";
        assertNotNull(name);
    }

    @Test
    void testSameAndNotSame() {
        String str1 = "hello";
        String str2 = "hello";
        assertSame(str1, str2);

        String str3 = new String("world");
        assertNotSame(str1, str3);
    }

    @Test
    void testArrayEquals() {
        int[] expectedArray = { 1, 2, 3 };
        int[] actualArray = { 1, 2, 3 };
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testThrows() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 5 / 0;
        });
    }

    @Test
    void testTimeout() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            // Code that should complete within 1 second
        });
    }

    @Test
    void testAssertAll() {
        assertAll("Numbers",
                () -> assertEquals(2, 1 + 1),
                () -> assertTrue(10 > 5),
                () -> assertFalse(5 > 10));
    }
}
