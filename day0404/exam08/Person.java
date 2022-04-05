package exam08;

public class Person {
	private String name;
	private int age;
	
	//생성자가 매개변수를 가질 수도 있다.(매개변수 2개)
	public Person(String name, int age) {
		this.name = name; //this를 써줘야 그 의미를 정확하게 구별할 수 있다.
		this.age = age;
	}
	
	//생성자 함수가 중복될 수 있다.
	public Person() {
		name = "홍길동"; //이럴경우에는 this를 써줘도 되고 안 써줘도 된다.
		age = 20;
	}
	
	public Person(String name) {
		this.name = name;
		age = 20;
	}
	
	public Person(int age) {
		name = "홍길동";
		this.age = age;
	}
	
	//name에 접근하여 값을 설정하는 메소드를 만든다.
	public void setName(String name) { //setName, setAge 같은 맴버에 접근하여 값을 변경시키는 메소드들 ==> setter(설정자)라고 한다.
		this.name = name;
	}
	//age에 접근하여 값을 설정하는 메소드
	public void setAge(int age) {
		this.age = age;
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
 
