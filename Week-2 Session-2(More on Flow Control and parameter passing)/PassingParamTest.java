package shubham;

public class PassingParamTest{
public static void main(String[] args) {
int x = 1;
int y = 2;
// Before Modification
System.out.println(x+" "+y); //1 2
modify(x, y);
// After Modification
System.out.println(x+" "+y); //1 2
}
public static void modify(int x1, int y1) {
x1 = 5;
y1 = 10;
}
}
