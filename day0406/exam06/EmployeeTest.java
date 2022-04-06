package exam06;

import java.util.ArrayList;
import java.util.Scanner;

//��� �������� �������� �������� �Ӽ���� ��ɵ��� �̾� �θ�Ŭ������ �����. ==> �Ϲ�ȭ
abstract class Employee {
	protected String name;
	protected int no;
	protected int salary; // �޿�

	public abstract void computeSalary();
	// �����޿�, �ð����޿� �� �޼ҵ带 ��üȭ�� �� ����.
	// �׷��� �ڽ�Ŭ�������� �ݵ�� �� �޼ҵ带 ������ �ϵ��� ����

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Employee(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", no=" + no + ", salary=" + salary + "]";
	}

}

//�ſ� ������ �޿��� �޴� ����
class SalariedEmployee extends Employee { // ������ ����
	private int hobong; // ȣ��
	private int base; // �⺻��
	private int extra_pay; // ����

	public SalariedEmployee(String name, int no, int hobong) {
		super(name, no);
		this.hobong = hobong;

	}

	@Override
	public void computeSalary() {
		switch (hobong) {
		case 1:
			base = 2500000;
			extra_pay = 250000;
			break;
		case 2:
			base = 3000000;
			extra_pay = 300000;
			break;
		case 3:
			base = 4000000;
			extra_pay = 400000;
			break;
		}

		salary = base + extra_pay;

	}

	@Override
	public String toString() {
		return "SalariedEmployee [hobong=" + hobong + ", base=" + base + ", extra_pay=" + extra_pay + ", name=" + name
				+ ", no=" + no + ", salary=" + salary + "]";
	}

}

//���� �ð���ŭ �޿��� �޴� ����
class HourlyEmployee extends Employee { // �ð��� ����
	private int hours; // ���� �ð�
	private int base; // �ñ�

	public HourlyEmployee(String name, int no, int base, int hours) {
		super(name, no);
		this.base = base;
		this.hours = hours;
	}

	@Override
	public void computeSalary() {
		salary = base * hours;

	}

	@Override
	public String toString() {
		return "HourlyEmployee [hours=" + hours + ", base=" + base + ", name=" + name + ", no=" + no + ", salary="
				+ salary + "]";
	}

}

public class EmployeeTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();

		
		// ����� ���� �Է¹ޱ�.
		int type; //������ �������, �ð��� ������� �Է��� ���� 1. ������, 2. �ð��� 
		int n = 0; // �迭�� �ε����� ���� ����
		Scanner sc = new Scanner(System.in);
		
		while (true) { //��� ����, ���Ḧ ���� 0�� �Է��ϱ�������
			System.out.println("1. ��������� 2. �ð������ 0. ����");
			type = sc.nextInt(); //������ �������, �ð��� ������� �Է¹���

			if (type == 0) { //type�� 0�̸� ����
				System.out.println("����Ǿ����ϴ�.");
				break;

			}

			String name; //�̸��� ������ ����
			int no; //�����ȣ�� ������ ����

			System.out.print("����� �̸�: ");
			name = sc.next();

			System.out.print("��� ��ȣ: ");
			no = sc.nextInt();

			if (type == 1) { //������ ����̶�� 
				int hobong;
				System.out.print("ȣ���� �Է��ϼ���: ");
				hobong = sc.nextInt(); //ȣ���� �Է¹޴´�.
				
				//arr[n++] = new SalariedEmployee(name, no, hobong); //�Է¹��� �̸�, �����ȣ, ȣ���� ���� ������ ��� ��ü�� ���� SalariedEmployee�� ����
				list.add(new SalariedEmployee(name, no, hobong)); //������ ��ü�� �����ؼ� ����Ʈ�� ��´�.

			} else if (type == 2) { //�ð��� ����̶��
				int base, hours;

				System.out.print("�ð��� �޿��� �Է��ϼ���: ");
				base = sc.nextInt(); //�ð��� �޿��� �Է¹޴´�. 

				System.err.print("���� �ð��� �Է��ϼ���: "); 
				hours = sc.nextInt(); //���� �ð��� �Է¹޴´�

				//arr[n++] = new HourlyEmployee(name, no, base, hours); 
				//�Է¹��� �̸�, �����ȣ, �ð��� �޿�, ���� �ð��� ���� �ð��� ����� ���� HourlyEmployee�� ����
				
				list.add(new HourlyEmployee(name, no, base, hours));
				
				
				

			} else { //������ ����� �ƴϰ� �ð�������� �ƴϸ� �߸��ԷµǾ��ٰ� �޼��� ���
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}

		} // �Է��� ��

		//�迭�� ����: length
		//����Ʈ�� ����: size()
		//���ڿ��� ����: length()
		
		// �޿��� ����ϰ� ����ϱ�
		for (int i = 0; i < list.size(); i++) { //�Է��� �� ��ŭ �ݺ������Ͽ� 
		 	 Employee e = list.get(i); //����Ʈ�� ��Ҹ� �ϳ��� ������ ����� Employee ������ ��´�.
		 	 //����Ʈ���� ������ ����� ���� �ְ� �ð��� ����� ���� �ִ�. ��Ŷ� ��� ���Ͽ� Employee ������ ��ƿ´�.
		 	 
		 	 
			//arr[i].computeSalary(); // �� �迭�� ��ҿ� �޿��� ����Ѵ�.
			e.computeSalary(); //������ ����� ����Ʈ�� ��Ҹ� ���� �޿��� ����Ѵ�.
			
			System.out.println(e); //������ ����� ����Ʈ�� ��Ҹ� ����Ѵ�.
		}
	}

}
