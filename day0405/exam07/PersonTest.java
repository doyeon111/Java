package exam07;

class Person { //부모의 생성자가 먼저 동작한다.
	public Person() {
		System.out.println("Person의 생성자 동작함!");
	}
}

class Customer extends Person { // 부모의 생성자가 동작한 후에 자식의 생성자가 동작한다.
	public Customer() {
		//super(); //부모의 매개변수를 갖지 않는 생성자 ==> 기본생성자를 요구하는 명령이 생략되어있다.
		System.out.println("Customer의 생성자 동작함.");
	}
}
 
public class PersonTest {

	public static void main(String[] args) {
		Customer c = new Customer(); //기본생성자가 제공된다는 것

	}

}
