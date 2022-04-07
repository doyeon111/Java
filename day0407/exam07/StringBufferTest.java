package exam07;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
//		sb = sb + " Java"; 오류
		sb.append(" java"); // 원래있던 객체에 java를 추가(append)
		System.out.println(sb);

		String str = "hello";
		str = str + " java";
		// String은 기본자료형처럼 사용가능하다.

	}

	// StringBuffer 에 append를 통하여 문자열을 추가하면 새로운 객체가 만들어지는 것이 아니라, 원래 객체에 문자열이 추가된다.

}
