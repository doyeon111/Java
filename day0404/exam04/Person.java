package exam04;

public class Person {
	private String name;
	private int age;
	
	//생성자를 만들어보기
	public Person() { //클래스 이름과 동일하게
		name = "김민혁";
		age = 28;
		System.out.println("생성자가 동작하였습니다."); //객체생성시에 자동으로 동작
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
