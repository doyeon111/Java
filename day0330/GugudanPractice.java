package day0330;

public class GugudanPractice {

	public static void main(String[] args) {

		for(int i=2; i<=9; i++) { //2단부터 9단까지 1씩 증가하며 실행
			System.out.println(i + "단"); 
			for(int j=1; j<=9; j++) { // 1부터 9까지 실행
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println("---------------------------");
		}

	}

}
