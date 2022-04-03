package day0330;

public class StringCountTest {

	public static void main(String[] args) {
		String data = "hello java";
		//반복문을 이용하여 한 글자씩 가져와 출력

		for(int i = 0; i < data.length(); i++) { //i가 0부터 data의 길이만큼 실행
			char ch = data.charAt(i); 
			System.out.print(ch + " ");
		}
		

		
		
//		int cnt = data.length();//문자열이 모두 몇 글자인지 알려줌.
//		System.out.println(cnt);
//		
//		char ch = data.charAt(0);
//		System.out.println(ch);
//		
//		
//		char ch2 = data.charAt(1);
//		System.out.println(ch2);
//		
//		char ch3 = data.charAt(5);
//		System.out.println("|" + ch3 + "|"); //공백 문자도 엄연히 하나의 문자로 처리됨.
	}

}
