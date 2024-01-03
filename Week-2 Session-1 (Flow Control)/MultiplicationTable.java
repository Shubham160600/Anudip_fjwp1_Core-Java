package shubham;

public class MultiplicationTable {
static void createMultiplicationTable (int n, int m ) {
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= m; j++) {
System.out.print(i * j + "\t");
}
System.out.println();
}
}
public static void main(String[] args) {
createMultiplicationTable (5, 10);
}
}