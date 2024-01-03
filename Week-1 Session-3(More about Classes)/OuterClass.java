package saurabh;

public class OuterClass {
	// Outer class members and methods
	int nonStatic = 30;
	static int staticVar=10;
	// Static nested class
	public static class StaticNestedClass {
	// Static nested class members and methods
	int innerVal =100;
	void testMethod () {
	// This is not allowed as we can not access
	// non static member of outer class.
	// nonStatic =30;
	//Accessing static variable of outside class.
	// This is allowed.
	staticVar =40;
	System.out.println(staticVar);
	}
	static void message() {
	System.out.println("Static Method");
	}
	}
	public static void main(String[] args) {
	OuterClass.StaticNestedClass nestedObj = new
	OuterClass.StaticNestedClass();
	// Can access variable of nested class.
	System.out.println(nestedObj.innerVal);
	// Also we can call the methods of nested class;
	nestedObj.testMethod();
	//no need to create the instance of static nested class
	// to call static method.
	OuterClass.StaticNestedClass.message();
	}
	}