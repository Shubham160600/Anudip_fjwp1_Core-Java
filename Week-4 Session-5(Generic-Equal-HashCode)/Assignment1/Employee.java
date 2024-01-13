/* Employee Class Example. */

package shubham;

import java.util.HashSet;

class Employee {
    private int employeeID;
    private String employeeName;

    public Employee(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return employeeID == employee.employeeID;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John");
        Employee emp2 = new Employee(2, "Jane");
        Employee emp3 = new Employee(3, "Doe");

        HashSet<Employee> employeeSet = new HashSet<>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);

        Employee empWithSameID = new Employee(1, "SameIDEmployee");
        boolean added = employeeSet.add(empWithSameID);

        System.out.println("Employee added to set: " + added);

        System.out.println("Employees in the set:");
        for (Employee emp : employeeSet) {
            System.out.println(emp.employeeID + ": " + emp.employeeName);
        }
    }
}
