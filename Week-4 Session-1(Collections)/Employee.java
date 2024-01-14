/* example of how you might create and use an ArrayList of a custom type. */

package collectionsdemo;

public class Employee {
	private int Id;
	private String name;
	private String address;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(int id, String name, String address) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", address=" + address + "]";
	}
}
