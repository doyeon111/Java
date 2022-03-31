package day0331;

public class WhileTest02 {

	public static void main(String[] args) {
		
		int i = 1;
		boolean flag = false;
		while (!flag) { 
			System.out.println("hello");
			i++;
			if(i>3) {
				flag = true;
			}
		}
		System.out.println("종료");
		System.out.println("i: " + i);
		
		
		

		/*
		int i = 1;
		boolean flag = true;
		while (flag) { //while문의 조건식의 결과는 반드시 boolean이어야 한다. (true, false)같은.. true는 계속 참이라는 뜻.
			if(i > 3) { //i가 3보다 크면 탈출
				break;
			}
			System.out.println("hello");
			
			i++;
		}
		System.out.println("종료");
		System.out.println("i: " + i); //i의 값이 4가 되면 탈출 */
	}

}
