package day0330;


public class SwitchPractice03 {

	public static void main(String[] args) {

		int n = 2;
		//반드시 각각의 case문 끝에 break가 있어야 하는 것은 아닙니다.
		//내가 해결해야 할 문제에 따라서 적절한 곳에 break를 둘 수 있다.
		switch (n) {
		case 0: System.out.println("영");
		case 1: System.out.println("일"); break;
		case 2: System.out.println("이"); break;
		case 3: System.out.println("삼");
		case 4: System.out.println("사"); 
		case 5:System.out.println("오");
		case 6:System.out.println("육");
		case 7:System.out.println("칠");
		case 8:System.out.println("팔");
			break;
		case 9:System.out.println("구");
		default:
			System.out.println("0~9사이의 숫자가 아닙니다.");
		}
		System.out.println("작업종료");
	}

}
