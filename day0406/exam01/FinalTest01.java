package exam01;

//final 클래스 변수명 앞에 올 경우

class Person {
	String name = "홍길동";
	int age = 20;
	final static String ADDR = "서울시 마포구 서교동"; //final이면 static이다. (상수는 모두 대문자로 표현하여 일반 멤버변수와 구분한다.)
	//final은 어차피 못 바꾸는 것이라서 객체마다 따로 메모리를 잡을 필요가 없다.
	//그래서 final이면 static으로 만들어서 모든 객체가 같이 사용한다.
}

public class FinalTest01 {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.age = 21;
		p2.age = 31; //값이 변할 수 있음.
		
		//p1.ADDR = "제주도 서귀포시 애월읍"; //final로 값을 주었기 때문에 대입해서 값을 바꿀 수 없음. 오류가 발생
		//p2.ADDR = "경기도 파주시" //addr은 상수이기 때문에 값을 변경할 수 없다.

	}

}
