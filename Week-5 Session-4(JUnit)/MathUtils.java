/* White-Box Testing. */

package shubham;

public class MathUtils {
    public static double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return (double) dividend / divisor;
    }
}
