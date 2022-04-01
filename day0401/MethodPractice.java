package day0401;

//두 개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아 출력하는 메소드를 정의
//메소드의 역할에 따라 리턴값이 있을수도 있고 없을 수도 있다. 
//리턴 값이 있을 때는 메소드 이름 왼쪽에 리턴 값의 자료형을 써준다. 
//리턴 값이 없을 때는 void 라고 써준다. 
public class MethodPractice {
	public static int max(int a, int b) { //void가 써있으면 return값이 아무것도 없다 라는 말.
		int r;
		if (a > b) {
			r = a;
		} else {
			r = b;
		}
		return r; //리턴 값의 자료형에 따라 메소드 이름 왼쪽에 동일한 자료형을 써준다.
	}

	public static void main(String[] args) {
		int result = max(3, 4); //모두 int를 써줘야함.
		
		System.out.println(result);
		System.out.println(max(40,30));

	}

}
