package exam04;

class Person {
	String name;
	int age;

	public Person(String name, int age) { // 생성자 만들기
		this.name = name;
		this.age = age;
	}
}

class Exam03 {
	// Person 객체를 매개변수로 전달받아 나이를 1 증가하는 메소드를 정의
	public static void plusOne(Person p) { // 매개변수를 Person 자료형으로 받겠다.
		p.age++;
		System.out.println("메소드 안에서 출력");
		System.out.println(p.name + ", " + p.age);
		System.out.println();
	}
}

public class CallByReferenceTest02 {

	public static void main(String[] args) {
		Person kim = new Person("김민혁", 28); //가장 먼저 main에 있는 것을 실행하게 된다.
		System.out.println("메소드 호출 하기 전"); //그냥 원래의 28이라는 나이가 나오게 된다. (복사해준것과 다름이 없다.)
		System.out.println(kim.name + ", " + kim.age);
		System.out.println();

		Exam03.plusOne(kim);

		System.out.println("메소드 호출 한 후");
		System.out.println(kim.name + ", " + kim.age);
		System.out.println();

	} 

}
