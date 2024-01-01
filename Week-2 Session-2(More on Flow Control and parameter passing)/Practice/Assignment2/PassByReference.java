//package shubham;

class MyNumber {
    int value;

    MyNumber(int value) {
        this.value = value;
    }
}

public class PassByReference {
    public static void main(String[] args) {
        MyNumber num = new MyNumber(10);
        System.out.println("Before calling the method: " + num.value);

        // Call a method that modifies the object (pass by reference)
        modifyValue(num);

        System.out.println("After calling the method: " + num.value);
    }

    // Method to modify the object (pass by reference)
    public static void modifyValue(MyNumber myNumber) {
        myNumber.value++;
        System.out.println("Inside the method: " + myNumber.value);
    }
}
