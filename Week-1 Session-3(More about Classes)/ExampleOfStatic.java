package saurabh;

public class ExampleOfStatic {
	// variables declared static
	static String countryName = "India";
	static String currency ="INR";
	// method declared as static
	static void display() {
	System.out.println("Welcome!");
	}
	// non static field
	int nonStaticFiled=20;
	public static void main(String[] args) {
	// Calling static fields and method by class name.
	System.out.println (ExampleOfStatic.countryName);
	System.out.println (ExampleOfStatic.currency);
	ExampleOfStatic.display();
	// Following line will produce compilation error
	// because non static filed cannot be accessed
	// by class name.
	//System.out.println (ExampleOfStatic.nonStaticFiled);
	}
	}