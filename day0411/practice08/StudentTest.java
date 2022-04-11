package practice08;
//0408 숙제 pdf 8번문제
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Student {
	private String name, addr, phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Student(String name, String addr, String phone) { //생성자
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(addr, name, phone);
	}

	@Override
	public boolean equals(Object obj) { //삭제하기 위하여 필요함
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(addr, other.addr) && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone);
	}
	
	
	
	
}

public class StudentTest {
	public static Scanner sc; //스캐너를 모두 사용하기 위하여
	
	public static void printMenu() {
		System.out.println("----------------------------------------------");
		System.out.println("1. 학생등록, 2. 검색, 3. 삭제, 4. 모두출력, 0. 종료");
		System.out.print("메뉴를 선택하세요: ");
	}

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		sc = new Scanner(System.in);
		int menu;
		
		while(true) {
			printMenu();
			menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
			
			switch(menu) {
			case 1: insertStudent(list);break;
			case 2: searchStudent(list);break;
			case 3: deleteStudent(list);break;
			case 4: printStudent(list);break;
			}
		}
		
		System.out.println("프로그램을 종료하였습니다.");
	}

	private static void printStudent(ArrayList<Student> list) {
		System.out.println("이름\t 주소\t 전화번호\t");
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getName() + "\t" + s.getAddr() + "\t" + s.getPhone());
		}
		
	}

	private static void deleteStudent(ArrayList<Student> list) {
		String name;
		System.out.print("삭제할 학생의 이름을 입력하세요: ");
		name = sc.next();
		
		
		
//		Student s1 = new Student("홍길동", "서울", "1111");
//		Student s2 = new Student("홍길동", "서울", "1111");
//		
//		if(s1.equals(s2)) { //두 객체가 동일한 값을 가지고 있는가?
//			
//		}
		
		
//		ArrayList<Student> list2 = new ArrayList<Student>();
//		list2.add(new Student("홍길동", "서울", "1111"));
//		list2.add(new Student("이순신", "부산", "2222"));
//		
//		Student s1 = new Student("홍길동", "서울", "1111");
//		list2.remove(s1);
//		//리스트의 요소를 삭제할 때에 인덱스가 아닌 객체를 매개변수로 전달하면 equals 메소드를 요구한다.
		
		
		
		
//		for(int i=0; i<list.size(); i++) { //이렇게 하면 equals가 없어도됨.( Student 클래스에서 만들어준  equals)
//			Student s = list.get(i);
//			if(s.getName().equals(name)) {
//				list.remove(i);
//			}
//		}
		
		
		for(Student s: list) { //Student 클래스에서 equals 메소드를 생성해줌.
			if(s.getName().equals(name)) {
				list.remove(s); //s객체를 지워라
				System.out.println(name + "학생의 정보를 삭제하였습니다.");
			}
		} 
		
		
		
	}

	private static void searchStudent(ArrayList<Student> list) {
		String name;
		System.out.print("검색할 학생의 이름을 입력하세요: ");
		name = sc.next();
		
		for(Student s: list) {
			if(s.getName().equals(name)) {
				System.out.println("검색한 학생의 정보는 다음과 같습니다.");
				System.out.println(s.getName()+"\t" + s.getAddr()+"\t" + s.getPhone());
			}
		}
		
	}

	private static void insertStudent(ArrayList<Student> list) {
		String name, addr, phone;
		
		System.out.print("등록할 학생의 이름을 입력하세요: ");
		name = sc.next();
		System.out.print("등록할 학생의 주소을 입력하세요: ");
		addr = sc.next();
		System.out.print("등록할 학생의 전화번호을 입력하세요: ");
		phone = sc.next();
		
		
		Student s = new Student(name, addr, phone);
		list.add(s);
		System.out.println("학생의 정보를 등록하였습니다.");
	}

}







