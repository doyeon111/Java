package day0330;

public class Practice04 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) { //1부터 100까지 숫자
			if(i % 3 == 0 || i % 4 == 0) { //3의 배수 또는 4의 배수
				sum += i; // 배수들의 합
			}
		}
		System.out.println("3 또는 4의 배수의 합: " + sum);

	}

}
