package exam01;

public class SistUtilTest {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		SistUtil util = new SistUtil();
		System.out.println(util.getMax(a, b)); //�ڷ����� �Ǵ��ؼ� ��� 
		System.out.println(util.getMax(5, 6, 7)); //int 3���� ���� ���� ���
		System.out.println(util.getMax(2.7, 5.7));
		
		int []arr = {6, 2, 3, 9, 7};
		System.out.println(util.getMax(arr)); //arr�迭���� ū ���� ã����� ��.

	}

}
