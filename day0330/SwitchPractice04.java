package day0330;


public class SwitchPractice04 {

	public static void main(String[] args) {

		int n = 2;
		//�ݵ�� ������ case�� ���� break�� �־�� �ϴ� ���� �ƴմϴ�.
		//���� �ذ��ؾ� �� ������ ���� ������ ���� break�� �� �� �ִ�.
		
		//���� ó���� �ϴ� case���� ���ٷ� ǥ���� �� �ִ�.
		switch (n) {
		case 0: case 1: System.out.println("��"); break;
		case 2: System.out.println("��"); break;
		case 3:
		case 4: 
		case 5:
		case 6:System.out.println("��");
		case 7:System.out.println("ĥ");
		case 8:
			break;
		case 9:System.out.println("��");
		default:
			System.out.println("0~9������ ���ڰ� �ƴմϴ�.");
		}
		System.out.println("�۾�����");
	}

}
