package shubham;

public class TwoDArrayExample {
public static void main(String[] args) {
int [][] arr = new int [3][4];
// Assign the values
for (int i = 0; i < arr.length; i++) {
for (int j = 0; j < arr[0].length; j++) {
arr[i][j] = i*j;
}
}
// Print the values
//Iterate through all rows
for (int i = 0; i < arr.length; i++) {
// Go through all columns in a row
for (int j = 0; j < arr[i].length; j++) {
//print value of the array element
System.out.print(arr[i][j] + " " );
}
// Line feed after printing a row
System.out.println();
}
}
}
