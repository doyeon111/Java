package Practice187_02;

public class Person {
	public String name;
	private String mobile, office, email;
	
	public void setName(String n) { 
		name = n;
	}
	public void setMobile(String m) { 
		mobile = m;
	}
	public void setOffice(String o) { 
		office = o;
	}
	public void setEmail(String e) { 
		email = e;
	}
	public String getName() {
		return name;
	}
	public String getMobile() {
		return mobile;
	}
	public String getOffice() {
		return office;
	}
	public String getEmail() {
		return email;
	}
	public Person(String n, String m, String o, String e) {
		super();
		this.name = n;
		this.mobile = m;
		this.office = o;
		this.email = e;
	}
	
	public String toString() {
		return "�̸�: " + name + "\t" +
				"��ȭ��ȣ: " + mobile + "\t" +
				"���� ��ȭ��ȣ: " + office + "\t" +
				"�̸���: " + email;

		
	}
	

	
}
