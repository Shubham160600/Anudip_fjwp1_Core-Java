package shubham;

//Bubble sort
//Time Complexity : O(N^2)
//Space Complexity : O(1)
public class BubbleSort
{
static void bubbleSort(int a[])
{
int len = a.length;
for (int i = 0; i < len-1; i++)
for (int j = 0; j < len-i-1; j++)
if (a[j] > a[j+1]) //comparing the pair of elements
{
//swapping a[j+1] and a[i]
int temp = a[j];
a[j] = a[j+1];
a[j+1] = temp;
}
}
/* Prints the array */
static void printArray(int a[])
{
int len = a.length;
for (int i = 0; i < len; i++)
System.out.print(a[i] + " "); //print the sorted array
System.out.println();
}
//Main method to test the sorting
public static void main(String args[])
{
int arr[] = {7, 2, 9, 6, 4};
System.out.println("Initial array is:");
printArray(arr); //Calling the printArray function
bubbleSort(arr);//Calling the bubbleSort function
System.out.println("Sorted array is:");
printArray(arr); //Calling the printArray function
}
}

