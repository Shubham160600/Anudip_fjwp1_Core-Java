/* Rethrowing the Same Exception in java. */

package shubham;

public class RethrowExceptionExample {
    public static void main(String[] args) {
        try {
            performOperation();
        } catch (CustomException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
    }

    public static void performOperation() throws CustomException {
        try {
            // Some operation that might throw an exception
            throw new CustomException("Something went wrong.");
        } catch (CustomException e) {
            System.out.println("Caught exception in performOperation: " + e.getMessage());
            // Rethrow the same exception or a wrapped version of it
            throw e;
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
