/* example of how you might create and use an ArrayList of a custom type. */

package collectionsdemo;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		employees.add(new Employee(1, "Steve", "Newyork"));
		employees.add(new Employee(2, "john", "London"));
		employees.add(new Employee(3, "Tim", "India"));
		for(Employee e:employees) {
			System.out.println(e);
		}
	}
}