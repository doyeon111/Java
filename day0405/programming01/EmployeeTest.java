package programming01;

//모든 직원들이 가져야할 공통적인 속성들과 기능들을 뽑아 부모클래스를 만든다. ==> 일반화
abstract class Employee {
	protected String name;
	protected int no;
	protected int salary; // 급여

	public abstract void computeSalary();
	// 고정급여, 시간제급여 이 메소드를 구체화할 수 없다.
	// 그러나 자식클래스들은 반드시 이 메소드를 재정의 하도록 강제

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

//매월 정해진 급여를 받는 직원
class SalariedEmployee extends Employee { // 월급제 직원
	private int hobong; // 호봉
	private int base; // 기본급
	private int extra_pay; // 수당

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

//일한 시간만큼 급여를 받는 직원
class HourlyEmployee extends Employee { // 시간제 직원
	private int hours; //일한 시간
	private int base; //시급

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
//여러명의 사원관리를 하고싶다.
//또, 사용자한테 정보를 입력받아 저장하고 싶다.
public class EmployeeTest {

	public static void main(String[] args) {
		SalariedEmployee e1 = new SalariedEmployee("홍길동", 1001, 3);
		HourlyEmployee e2 = new HourlyEmployee("이순신", 1002, 200000, 120);
		
		
		e1.computeSalary();
		e2.computeSalary();
		
		System.out.println(e1); //사원 정보 출력
		System.out.println(e2);
	}

}
