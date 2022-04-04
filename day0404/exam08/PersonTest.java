package exam08;

public class PersonTest {

	public static void main(String[] args) {
//		Person p1;
//		p1 = new Person();
		
		Person p1 = new Person(); //매개변수가 하나도 없으면 Person.java에서 설정해놓은 홍길동이 나옴.
		Person p2 = new Person("이순신" , 30);
		Person p3 = new Person("이순신");
		Person p4 = new Person(30);
		
		p1.eat("라면");
		p2.eat("라면");
		p3.eat("라면");
		p4.eat("라면");
		
		

	}

}
