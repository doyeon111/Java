package day0330;

public class NestedLoop {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) { //i를 3번째까지 출력
			System.out.println(i);
			for(int j=1; j<=4; j++) { //hello를 4번 반복출력
				System.out.println("hello");
			}
			System.out.println("---------------------------");
		}
	}

}
