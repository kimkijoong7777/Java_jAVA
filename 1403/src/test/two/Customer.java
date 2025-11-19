package test.two;

public class Customer {
	public String name;
	public String phone;
	public int point;
	
	public Customer() {}
	
	public Customer(String name, String phone) {
		this.name = name;
		this.phone = phone;
		this.point = 0;
	}
	
	public Customer(String name, String phone, int point) {
		this.name = name;
		this.phone = phone;
		this.point = point;
	}
	
	int updatePoint() {
		int amount =+ point;
		return point;
	}
	int setPoint() {
		return point;
	}
}
