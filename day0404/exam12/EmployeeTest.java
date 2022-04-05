package exam12;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("김민지", "010-1111-2222", 3000);
		
		
		System.out.println("이름: " + e1.getName()+ "\t"
		+ " 전화번호: " + e1.getPhone() + "\t"
		+ " 연봉: " + e1.getAnnual() + "\t"
		);
		
		System.out.println("이름: " + e2.getName()+ "\t"
		+ " 전화번호: " + e2.getPhone() + "\t"
		+ " 연봉: " + e2.getAnnual() + "\t"
		);

	}

}
 
