package Shubh;

import java.io.Console;
public class ConsoleInputExample1 {
public static void main(String[] args) {
Console console = System.console();
if (console == null) {
System.out.println("Console not available. Please run this program from a console environment.");
return;
}
String name = console.readLine("Enter your name: ");
System.out.println("Hello, " + name + "!");
}
}
