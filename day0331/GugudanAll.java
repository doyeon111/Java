package day0331;

public class GugudanAll {

	public static void main(String[] args) {

		int i = 2;
		while (i <= 9) { //ó�� ~���� ����ϱ� ���� (2 * 1 �� 2�� ����
			System.out.println(i + "��");

			int j = 1;//�� �ʱⰪ�� ù ��° while�� �ȿ� �־����.
			while (j <= 9) { //1~9���� ��������. (2 * 1 �� 1�� ����
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
			}
			i++;
			System.out.println("---------------------------");
		}
		//��ø while������ ���ʿ� �ִ� while���� �ʱⰪ�� �ٱ��� while�� �ӿ� �־�� �Ѵ�.
	}

}
