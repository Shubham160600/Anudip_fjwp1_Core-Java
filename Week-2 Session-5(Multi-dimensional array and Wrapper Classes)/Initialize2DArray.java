package shubham;

public class Initialize2DArray {
public static void main(String[] args) {
// Declare and initialize a 2D Array
int[][] twoDArray = {
{1,2},
{2,3},
{3,4},
{5,6}
};
// Print array elements
//Iterate through all rows
for(int i = 0 ; i < twoDArray.length ; i++){
// Go through all columns in a row
for(int j = 0 ; j < twoDArray[i].length; j++){
//print column value
System.out.print(twoDArray[i][j] + " ");
}
// Line feed after printing a row
System.out.println();
}
}
}
