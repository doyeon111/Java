package day0331;

public class ContinueTest {

	public static void main(String[] args) {
		
		int i;
		for(i=1; i<=10; i++) {
			if(i%3==0) { //3,6,9 제외
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println("종료");
		System.out.println("반복문 탈출 후에 i값: " + i); 
	}

}
