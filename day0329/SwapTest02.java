package day0329;

public class SwapTest02 {

	public static void main(String[] args) {
		String cup1 = "사이다";
		String cup2 = "콜라";
		
		System.out.println("cup1: " + cup1);
		System.out.println("cup2: " + cup2);
		
		String temp;
		
		temp = cup1;
		cup1 = cup2;
		cup2 = temp;
		
		System.out.println("cup1: " + cup1);
		System.out.println("cup2: " + cup2);
		// 두 변수의 값을 서로 맞바꾸어 출력해 보기

	}

}
