package exam12;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("�����", "010-1111-2222", 3000);
		
		
		System.out.println("�̸�: " + e1.getName()+ "\t"
		+ " ��ȭ��ȣ: " + e1.getPhone() + "\t"
		+ " ����: " + e1.getAnnual() + "\t"
		);
		
		System.out.println("�̸�: " + e2.getName()+ "\t"
		+ " ��ȭ��ȣ: " + e2.getPhone() + "\t"
		+ " ����: " + e2.getAnnual() + "\t"
		);

	}

}
