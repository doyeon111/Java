package exam04;
//값에 의한 호출에 대한 특징
class Exam01 {
	// 정수형 변수하나를 매개변수로 전달받아 1 증가시키는 메소드
	public static void plusOne(int n) {
		n = n + 1;
		System.out.println(n); //리턴 값 생략
		System.out.println("메소드 안에서 값을 변경하였습니다.");
		System.out.println();
	}
}

public class CallByValueTest {

	public static void main(String[] args) {
		int age;
		age = 28;
		Exam01.plusOne(age); //클래스 이름으로 static 메소드를 불러올 수 있다.(메소드 호출)
		System.out.println("나이: " + age); //n=n+1로 1 더한 값이 아닌 원래의 값 28이 출력되게 된다.(기본자료형이 전달되기 때문에)
		System.out.println("그러나 메소드 호출하는 쪽에서는 변경된 내용이 적용되지 않아요!");
	}

}
