package exam07;

import java.util.Scanner;

//��������� ��ȣ�� ��ȣȮ���� �Է¹޾� ���� ��ġ���� Ȯ���Ͽ� �޽����� ����ϴ� ���α׷�
public class StringTest05 {
	public static void main(String[] args) {
		String pwd, checkpwd;
		Scanner sc = new Scanner(System.in);

		System.out.print("��ȣ�� �Է��ϼ���: ");
		pwd = sc.next();

		System.out.print("��ȣ�� �ٽ��ѹ� �Է��ϼ���: ");
		checkpwd = sc.next();

		if(pwd.equals(checkpwd)) { //equals�� ��ҹ��� ����
			System.out.println("Ȯ�εǾ����ϴ�.");
		} else {
			System.out.println("��ȣȮ���� ��ġ���� �ʽ��ϴ�.");
		}
		
	}
}
