package day0330;

public class SwitchTest02 {

	public static void main(String[] args) {
		int n = 2;
		
		
		//해당 case부터 끝까지 동작
		//만약, 해당 case에 있는 명령어(들)만 동작시키려면 각 case문 끝에 break를 둡니다.
		switch(n+1) {// n+1을 쓰게되면 계산한 값부터 아래 값들이 다 나온다.
			case 1: 
				System.out.println("일"); 
				break;
			case 2: 
				System.out.println("이");
				break;
			case 3: 
				System.out.println("삼");
				break;
			case 4: 
				System.out.println("사");
				break;
			case 5: 
				System.out.println("오");
				break;
			default:
				System.out.println("1에서 5사이의 값이 아닙니다.");
		
		
		
		} 

	}

}
