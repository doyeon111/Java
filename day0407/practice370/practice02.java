package practice370;




import java.util.Scanner;

public class practice02 {
	
	
	public static void setText(String n) { //String을 상대
		System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n;
		int sum2 = 0;
		System.out.println("숫자를 입력하세요: ");
		n = sc.nextLine();
		String []sum = n.split(" ");

		

		
		for(int i=0; i<sum.length; i++) {
			sum2 += Integer.parseInt(sum[i]);
		}
		
		System.out.println("정수들의 합은 " + sum2);
	}

}
