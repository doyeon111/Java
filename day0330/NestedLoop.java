package day0330;

public class NestedLoop {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			System.out.println(i);
			for(int j=1; j<=4; j++) {
				System.out.println("hello");
			}
			System.out.println("---------------------------");
		}
	}

}
