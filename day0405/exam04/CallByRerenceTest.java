package exam04;

class Exam02 {
	
	//정수형 배열을 매개변수로 전달받아 모든 요소를 출력하는 메소드를 정의
	public static void printArray(int []data) {
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
	}
	
	// 정수형 배열을 매개변수로 전달받아 모든 요소를 1씩 증가시키는 메소드를 정의
	public static void plusOne(int[] data) {
		for (int i = 0; i < data.length; i++) {
			data[i]++;
		}
		
		System.out.println("메소드 안에서 배열의 요소 출력");
		printArray(data); //위에서 만들어준 메소드를 출력
	}
}

public class CallByRerenceTest {

	public static void main(String[] args) {
		int []arr = {10,20,30,40,50};
		System.out.println("메소드 호출하기 전의 배열");
		Exam02.printArray(arr);
		
		Exam02.plusOne(arr); //메소드 호출문
		
		System.out.println("메소드 호출한 후 배열");
		Exam02.printArray(arr);
		

	}
 
}
