package day0331;

public class WhileAndDoWhile {
//while���� do~while���� ����
	public static void main(String[] args) {
		
		int i = 10;
		while (i <= 5) { //ó������ ������ �������� �ʴ´ٸ� �� ���� ������� �ʴ´�.(while��)
			System.out.println("hello");
			i++;
		}

		System.out.println("---------------------------------------");

		int j = 10;
		do { //ó������ ������ �������� �ʾƵ�, �ϴ� ���� �� ���� ������ �Ѵ�.(do~while��)
			System.out.println("hello");
			j++;
		} while (j <= 5);

	}

}
