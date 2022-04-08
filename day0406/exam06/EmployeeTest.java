package exam06;

import java.util.ArrayList;
import java.util.Scanner;

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
	private int hours; // 일한 시간
	private int base; // 시급

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

		
		// 사원의 정보 입력받기.
		int type; //월급제 사원인지, 시간제 사원인지 입력할 변수 1. 월급제, 2. 시간제 
		int n = 0; // 배열의 인덱스를 위한 변수
		Scanner sc = new Scanner(System.in);
		
		while (true) { //계속 동작, 종료를 위한 0을 입력하기전까지
			System.out.println("1. 월급제사원 2. 시간제사원 0. 종료");
			type = sc.nextInt(); //월급제 사원인지, 시간제 사원인지 입력받음

			if (type == 0) { //type이 0이면 종료
				System.out.println("종료되었습니다.");
				break;

			}

			String name; //이름을 저장할 변수
			int no; //사원번호를 저장할 변수

			System.out.print("사원의 이름: ");
			name = sc.next();

			System.out.print("사원 번호: ");
			no = sc.nextInt();

			if (type == 1) { //월급제 사원이라면 
				int hobong;
				System.out.print("호봉을 입력하세요: ");
				hobong = sc.nextInt(); //호봉을 입력받는다.
				
				//arr[n++] = new SalariedEmployee(name, no, hobong); //입력받은 이름, 사원번호, 호봉을 갖고 월급제 사원 객체를 위한 SalariedEmployee를 생성
				list.add(new SalariedEmployee(name, no, hobong)); //월급제 객체를 생성해서 리스트에 담는다.

			} else if (type == 2) { //시간제 사원이라면
				int base, hours;

				System.out.print("시간당 급여를 입력하세요: ");
				base = sc.nextInt(); //시간당 급여를 입력받는다. 

				System.err.print("일한 시간을 입력하세요: "); 
				hours = sc.nextInt(); //일한 시간을 입력받는다

				//arr[n++] = new HourlyEmployee(name, no, base, hours); 
				//입력받은 이름, 사원번호, 시간당 급여, 일한 시간을 갖고 시간제 사원을 위한 HourlyEmployee를 생성
				
				list.add(new HourlyEmployee(name, no, base, hours));
				
				
				

			} else { //월급제 사원도 아니고 시간제사원도 아니면 잘못입력되었다고 메세지 출력
				System.out.println("잘못 입력하였습니다.");
			}

		} // 입력의 끝

		//배열의 길이: length
		//리스트의 길이: size()
		//문자열의 길이: length()
		
		// 급여를 계산하고 출력하기
		for (int i = 0; i < list.size(); i++) { //입력한 수 만큼 반복실행하여 
		 	 Employee e = list.get(i); //리스트의 요소를 하나씩 끄집어 내어와 Employee 변수에 담는다.
		 	 //리스트에는 월급제 사원일 수도 있고 시간제 사원일 수도 있다. 어떤거라도 담기 위하여 Employee 변수로 담아온다.
		 	 
		 	 
			//arr[i].computeSalary(); // 각 배열의 요소에 급여를 계산한다.
			e.computeSalary(); //끄집어 내어온 리스트의 요소를 갖고 급여를 계산한다.
			
			System.out.println(e); //끄집어 내어온 리스트의 요소를 출력한다.
		}
	}

} 
