/* example that combines generics and collections in Java to create a generic Stack data structure using the List interface. */

package shubham;

import java.util.ArrayList;
import java.util.List;

class GenericStack<T> {
    private List<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (!isEmpty()) {
            int lastIndex = stack.size() - 1;
            T item = stack.get(lastIndex);
            stack.remove(lastIndex);
            return item;
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        while (!intStack.isEmpty()) {
            System.out.println("Popped: " + intStack.pop());
        }

        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hello");
        stringStack.push("World");

        while (!stringStack.isEmpty()) {
            System.out.println("Popped: " + stringStack.pop());
        }
    }
}
