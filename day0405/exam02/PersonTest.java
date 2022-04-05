package exam02;

class Person {
	String name; // 일반 변수들은 객체를 생성해야만 메모리 공간이 확보된다.
	int age;
	static String addr; // 클래스 변수 -> 객체와 무관하게 사용하거나 모든 객체가 공동으로 사용하는 기억공간
	
	public void sayHello() { //일반 메소드
		System.out.println("안녕, " + name);
	}
	
	public static void pro() { //객체와 무관하게 객체없이도 동작하고 싶을 때 앞에 static을 붙여준다. ==> 클래스메소드
		System.out.println("Person의 pro 입니다.");
		//System.out.println(name); //name, age는 static 안에서 접근 할 수 없다.
		System.out.println(addr); //가능
		//static 메소드(클래스메소드) 안에서는 static 멤버(클래스변수, 클래스메소드)에만 접근할 수 있다.
		//객체를 생성해야만 확보되는 일반멤버에는 접근할 수 없다!
	}
}

public class PersonTest {

	public static void main(String[] args) {
		
		Person.pro(); //static 메소드는 객체와 무관하게 호출할 수 있다. 클래스 이름으로 접근한다.
		
		Person.addr = "서울시 마포구 서교동"; // 객체 없이 접근해야 하므로 클래스 이름으로 접근한다. ==> 클래스변수
		System.out.println(Person.addr);

		Person kim = new Person(); // 객체생성 , 객체를 생성해야지만 위에 class Person에 있는 name과 age 세트만큼 메모리가 잡힌다.
		Person lee = new Person(); // lee와 kim의 name, age는 별도의 메모리
		kim.name = "김민혁";
		kim.age = 28;

		lee.name = "이진주";
		lee.age = 26;
		
		kim.sayHello();
		lee.sayHello(); //일반 멤버 메소드는 반드시 객체를 생성하고 그 객체를 통해서 사용할 수 있다.

		System.out.println(kim.name + ", " + kim.age + ", " + kim.addr); // 객체가 있으면 객체를 통해서도 접근할 수 있다.
		System.out.println(lee.name + ", " + lee.age + ", " + lee.addr);

		kim.addr = "제주도 서귀포시 애월읍"; // 공동으로 사용하는 기억공간이기 때문에 모든 addr이 바뀐다.
		System.out.println(kim.addr); // 객체가 있으면 객체를 통해서도 접근할 수 있다.
		System.out.println(lee.addr);
		System.out.println(Person.addr);
	}

}
