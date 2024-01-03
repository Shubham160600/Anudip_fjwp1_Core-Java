package saurabh;

public class StaticExample {
	// A non static method
	int methodA() { return 1; }
	// A anonymous static class is created inside the class
	// and its method is redefined.
	static StaticExample staticInner = new StaticExample() {
	int methodA()
	{ return 2;
	}
	};
	public static void main(String[] args) {
	// The methodA will return 2 (not 1 as originally defined);
	System.out.println( staticInner.methodA());
	// Or from external class you can access it by class name.
	// It will also return 2
	System.out.println( StaticExample.staticInner.methodA());
	//It will return 1
	System.out.println( new StaticExample (). methodA());
	}
	}