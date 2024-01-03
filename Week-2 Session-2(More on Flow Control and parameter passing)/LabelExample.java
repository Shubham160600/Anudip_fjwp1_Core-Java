package shubham;

public class LabelExample {
public static void main(String[] args) {
outerLoop: // This is a labeled statement
for (int i = 1; i <= 3; i++) {
for (int j = 1; j <= 3; j++) {
if (i * j > 5) {
System.out.println("Exiting both loops.");
break outerLoop; // Using the labeled statement with break to exit both loops
}
System.out.println("i=" + i + " j=" + " i*j= " + i * j);
}
}
}
}
