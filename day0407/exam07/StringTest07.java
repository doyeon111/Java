package exam07;

public class StringTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "hello";
		String data2 = "Hello";

		if (data1.equals(data2)) { //equals == ��ҹ��� �����Ѵ�.
			System.out.println("��ҹ��� �����Ͽ� ���ƿ�.");
		} else {
			System.out.println("��ҹ��� �����Ͽ� �޶��.");
		}

		System.out.println("--------------------------------");

		if (data1.equalsIgnoreCase(data2)) { //equalsIgnoreCase  == ��ҹ��� ������ ����.
			System.out.println("��ҹ��� �������� ���ƿ�.");
		} else {
			System.out.println("��ҹ��� �������� �޶��.");
		}
	}

}
