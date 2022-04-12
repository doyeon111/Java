package exam01;
//멀티쓰레드의 필요성
class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		for(int i=1; i<=10; i++) {
			System.out.println("Hello" + name + "! " + i);
		}
 	}
}


public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("김유신");
		Person p2 = new Person("홍길동");
		p1.sayHello();
		p2.sayHello();

	}

}
 
