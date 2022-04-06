package exam04;

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
	private int hours; //���� �ð�
	private int base; //�ñ�

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
		//������ ����� ���� �� �ְ�, �ð��� ����� ���� �� �ִ� Employee �迭�� ������.
		Employee []arr = new Employee[3];
		
		arr[0] = new SalariedEmployee("ȫ�浿", 1001, 3);
		arr[1] = new HourlyEmployee("�̼���", 1002, 300000, 10);
		arr[2] = new SalariedEmployee("������", 1003, 2);
		
		for(int i=0; i<arr.length; i++) {
			arr[i].computeSalary(); //������
			System.out.println(arr[i]);
		}
	}

}
