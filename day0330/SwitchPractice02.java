package day0330;


public class SwitchPractice02 {

	public static void main(String[] args) {

		int n = 3;
		//반드시 각각의 case문 끝에 break가 있어야 하는 것은 아닙니다.
		//내가 해결해야 할 문제에 따라서 적절한 곳에 break를 둘 수 있다.
		//각 case 값의 크기 순서대로 올 필요는 없다. 그러나, case의 값이 중복이 되도록 하면 안됨.
		switch (n) {
		case 0: 
		case 1: 
		case 2: System.out.println("이"); break;
		case 4:
		case 3: 
		case 5:
		case 6: System.out.println("육");
		case 7:
		case 8:
		case 9:System.out.println("구"); break;
		default: System.out.println("0~9사이의 숫자가 아닙니다.");
		}
		System.out.println("작업종료");
	}

}
