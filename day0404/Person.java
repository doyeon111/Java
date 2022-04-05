package day0404;
/*
 * 사람 		 Person(클래스)
		속성
			이름		String name		"홍길동"
			나이 		int age			20
			
		동작
			먹는다	void eat(String food)
			씻는다	void wash(String soap)*/
public class Person {
	String name;
	int age;
	void eat(String food) { //어떤 음식을 먹는지 메소드
		System.out.println(age + "살 " + name + "이(가) " + food + "를(을) 먹어요");
		
		
	}
	
	void wash(String soap) { //어떤 음식을 먹는지 메소드
		System.out.println(age + "살 " + name + "이(가) " + soap + "으로 씻어요ㅣ");
		
		
	}
}
 
