package day0329;

public class VariableTest03 {

	public static void main(String[] args) {
		String korea;
		korea = "hello";
		System.out.println(korea); //변수안에 있는 내용을 출력 //변수(문자열 변수) 
		System.out.println("korea"); //korea 글자 출력 	//상수(문자열 상수)
		
		System.out.println(100); //정수형 상수				//상수(정수형 상수)
		System.out.println("100"); //문자열 상수			//상수(문자열 상수)
		
		System.out.println(100+200); //300으로 계산한 값이 나옴. (숫자끼리 오면 더하기 연산을 함)
		System.out.println("100" + "200"); // 문자열끼리 오면 연결
		System.out.println("100" + 200); // 앞에 문자열이 오면 연결
	}

}
