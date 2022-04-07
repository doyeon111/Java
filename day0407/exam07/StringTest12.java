package exam07;


//기본자료형 ==> String 
public class StringTest12 {
	
	public static void setText(String str) { //String을 상대
		System.out.println(str + "을 설정하였습니다.");
	}

	
	public static void plusOne(double data) {
		System.out.println(data+1);
	}
	
	public static void main(String[] args) {
		int data = 1024;
//		setText(data); //데이터 타입이 다르기때문에 오류가 난다.
//		setText(String.valueOf(data)); //처리된 데이터는  int이기 때문에 String으로 변환하여 만들어준다.
		setText(data+""); //간편하게 변환할 수 있다.

		
		System.out.println("------------------------------------------------");
		
		//String ==> 기본자료형
		
		String a = "1000";
		String b = "2000"; //두개의 문자열을 더하기 하고싶다.
		System.out.println(a+b); //이상태에서 실행을 하면 10002000으로 문자열이 연결된다.
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));// Integer.parseInt를 사용하여 정수로 변환하여 더해준다.
		
		plusOne(Double.parseDouble(a)); //plusOne 메소드에 있는 것을 더블로 바꾸어 실행
	}

}
