package day0329;

public class VariableTest03 {

	public static void main(String[] args) {
		String korea;
		korea = "hello";
		System.out.println(korea); //�����ȿ� �ִ� ������ ��� //����(���ڿ� ����) 
		System.out.println("korea"); //korea ���� ��� 	//���(���ڿ� ���)
		
		System.out.println(100); //������ ���				//���(������ ���)
		System.out.println("100"); //���ڿ� ���			//���(���ڿ� ���)
		
		System.out.println(100+200); //300���� ����� ���� ����. (���ڳ��� ���� ���ϱ� ������ ��)
		System.out.println("100" + "200"); // ���ڿ����� ���� ����
		System.out.println("100" + 200); // �տ� ���ڿ��� ���� ����
	}

}
