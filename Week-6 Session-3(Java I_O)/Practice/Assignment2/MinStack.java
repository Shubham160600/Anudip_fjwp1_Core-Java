/* Create a Java class called MinStack of Integers that supports standard stack operations (push, pop, top, and isEmpty) and also provides a getMin 
 * method that returns the minimum element in the stack. (Hints: Keep another stack that will hold the minimum value on the top of the stack). */

package shubham;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push operation
    public void push(int value) {
        mainStack.push(value);

        // Update the minimum stack
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    // Pop operation
    public void pop() {
        if (!mainStack.isEmpty()) {
            int poppedValue = mainStack.pop();

            // Update the minimum stack if the popped value is the current minimum
            if (poppedValue == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    // Top operation
    public int top() {
        if (!mainStack.isEmpty()) {
            return mainStack.peek();
        } else {
            throw new IllegalStateException("Stack is empty. Cannot retrieve top element.");
        }
    }

    // GetMin operation
    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        } else {
            throw new IllegalStateException("Stack is empty. Cannot retrieve minimum element.");
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(5);
        System.out.println("Current Minimum: " + minStack.getMin());

        minStack.push(2);
        minStack.push(1);
        System.out.println("Current Minimum: " + minStack.getMin());

        minStack.pop();
        System.out.println("Top element after pop: " + minStack.top());
        System.out.println("Current Minimum: " + minStack.getMin());
    }
}
