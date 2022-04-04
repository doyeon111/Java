package day0404;

public class PersonTest {

	public static void main(String[] args) {
		int a; //a의 데이터타입은 int
		a=5;
		double b;
		b=2.7; //기본 자료형은 바로 생성하여 사용할 수 있지만,
		
		Person kim; //객체 참조 변수
		kim = new Person(); //클래스는 이렇게 만들어줘야 사용할 수 있다.
		//접근 할 시 kim.name = "김민혁"; .은 접근연산자 (멤버접근연산자) 
		//kim.age = 28;
		kim.name = "김민혁";
		kim.age = 28;
		kim.wash("샴푸");
		kim.eat("우유");
		
		
		Person park;
		park = new Person();
		park.name = "박정수";
		park.age = 30;
		park.eat("초밥");
		park.wash("바디워시");

	}

}
