package day0330;

public class SumTest {

	public static void main(String[] args) {
		//1���� n���� ���� �����ϴ� ���α׷�
		int i = 1;
		int sum = 0;
		int n = 10;
		
		for(i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1���� " + n + "������ ���� " + sum);
	}

}
