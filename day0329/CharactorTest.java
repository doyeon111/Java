package day0329;

public class CharactorTest {

	public static void main(String[] args) {
		char a = '홍'; //한 글자 출력할 땐 char를 쓰고 ' ' 따옴표를 쓴다.
		String b = "홍길동"; //문자열을 출력할 땐 String을 사용하고 " " 쌍따옴표 사용
		String c = "홍";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
//		char d = "홍"; 오류남
//		String e = '홍'; 오류
		
		String data = "hello";
		char first = data.charAt(0); //hello 문자열에서 글자를 반환(0번지 인덱스 이므로 h를 반환)
		System.out.println(first);
	}

}
