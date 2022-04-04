package exam05;

public class Person {
	private String name;
	private int age;
	
	//생성자가 매개변수를 가질 수도 있다.(매개변수 2개)
	public Person(String n, int a) { //클래스 이름과 동일하게
		name = n;
		age = a;
	}
	
	//생성자 함수가 중복될 수 있다.
	public Person() {
		name = "홍길동";
		age = 20;
	}
	
	public Person(String n) {
		name = n;
		age = 20;
	}
	
	public Person(int a) {
		name = "홍길동";
		age = a;
	}
	
	//name에 접근하여 값을 설정하는 메소드를 만든다.
	public void setName(String n) { //setName, setAge 같은 맴버에 접근하여 값을 변경시키는 메소드들 ==> setter(설정자)라고 한다.
		name = n;
	}
	//age에 접근하여 값을 설정하는 메소드
	public void setAge(int a) {
		age = a;
	}
	
	//name을 반환하는 메소드를 만든다.
	public String getName() { //getName, getAge와 같은 맴버변수에 접근하여 값을 읽어오는 기능들 ==> getter(접근자)라고 한다.
		return name;
	}
	
	//age를 반환하는 메소드
	public int getAge() {
		return age;
	}
	
	public void eat(String food) {
		System.out.println(age + "살 " + name + "이(가) " + food + "를(을) 먹어요!");
	}
	
	public void wash(String soap) {
		System.out.println(age + "살 " + name + "이(가) " + soap + "으로 씻어요!");
	}
}
