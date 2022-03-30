package day0330;


public class SwitchPractice04 {

	public static void main(String[] args) {

		int n = 2;
		//반드시 각각의 case문 끝에 break가 있어야 하는 것은 아닙니다.
		//내가 해결해야 할 문제에 따라서 적절한 곳에 break를 둘 수 있다.
		
		//같은 처리를 하는 case들을 한줄로 표현할 수 있다.
		switch (n) {
		case 0: case 1: System.out.println("일"); break;
		case 2: System.out.println("이"); break;
		case 3:
		case 4: 
		case 5:
		case 6:System.out.println("육");
		case 7:System.out.println("칠");
		case 8:
			break;
		case 9:System.out.println("구");
		default:
			System.out.println("0~9사이의 숫자가 아닙니다.");
		}
		System.out.println("작업종료");
	}

}
