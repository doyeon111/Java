package day0330;


public class SwitchPractice02 {

	public static void main(String[] args) {

		int n = 3;
		//�ݵ�� ������ case�� ���� break�� �־�� �ϴ� ���� �ƴմϴ�.
		//���� �ذ��ؾ� �� ������ ���� ������ ���� break�� �� �� �ִ�.
		//�� case ���� ũ�� ������� �� �ʿ�� ����. �׷���, case�� ���� �ߺ��� �ǵ��� �ϸ� �ȵ�.
		switch (n) {
		case 0: 
		case 1: 
		case 2: System.out.println("��"); break;
		case 4:
		case 3: 
		case 5:
		case 6: System.out.println("��");
		case 7:
		case 8:
		case 9:System.out.println("��"); break;
		default: System.out.println("0~9������ ���ڰ� �ƴմϴ�.");
		}
		System.out.println("�۾�����");
	}

}
