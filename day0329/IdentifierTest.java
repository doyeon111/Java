package day0329;

public class IdentifierTest {

	public static void main(String[] args) {
		
		int number1 = 7;
		//int 2number = 7;
		//식별자 첫 글자에 숫자가 올 수 없다.
		
		//int your age = 5;
		//식별자에 공백을 포함할 수 없다.
		
		//int public = 5;
		// 예약어를 식별자로 사용x
		String name;
		name = "홍길동";
		
		String addr = "서울시 마포구 서교동";
		// 변수를 선언함과 동시에 값을 저장할 수 있다.
		
		int myAge;
		myAge = 20; //변수를 사용하기 위해서는 반드시 선언하고 사용해야함.
		System.out.println(myAge);

	}

}
