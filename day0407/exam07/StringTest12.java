package exam07;


//�⺻�ڷ��� ==> String 
public class StringTest12 {
	
	public static void setText(String str) { //String�� ���
		System.out.println(str + "�� �����Ͽ����ϴ�.");
	}

	
	public static void plusOne(double data) {
		System.out.println(data+1);
	}
	
	public static void main(String[] args) {
		int data = 1024;
//		setText(data); //������ Ÿ���� �ٸ��⶧���� ������ ����.
//		setText(String.valueOf(data)); //ó���� �����ʹ�  int�̱� ������ String���� ��ȯ�Ͽ� ������ش�.
		setText(data+""); //�����ϰ� ��ȯ�� �� �ִ�.

		
		System.out.println("------------------------------------------------");
		
		//String ==> �⺻�ڷ���
		
		String a = "1000";
		String b = "2000"; //�ΰ��� ���ڿ��� ���ϱ� �ϰ�ʹ�.
		System.out.println(a+b); //�̻��¿��� ������ �ϸ� 10002000���� ���ڿ��� ����ȴ�.
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));// Integer.parseInt�� ����Ͽ� ������ ��ȯ�Ͽ� �����ش�.
		
		plusOne(Double.parseDouble(a)); //plusOne �޼ҵ忡 �ִ� ���� ����� �ٲپ� ����
	}

}
