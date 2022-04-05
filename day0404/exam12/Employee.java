package exam12;
//pdf 05번문제
public class Employee {
	private String name, phone;
	private int annual;
	
	public Employee(String name, String phone, int annual) {
		this.name = name;
		this.phone = phone;
		this.annual = annual;
	}
	public Employee() {
		name = "홍길동";
		phone = "010-1234-5678";
		annual = 3200;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAnnual() {
		return annual;
	}
	public void setAnnual(int annual) {
		this.annual = annual;
	} 
	
	
}
