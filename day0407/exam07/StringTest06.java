package exam07;

import java.util.Scanner;

//��������� �̸��� �Է¹޾� �达���� �ƴ��� �Ǻ��Ͽ� �޽����� ����ϴ� ���α׷��� �ۼ�
public class StringTest06 {

	public static void main(String[] args) {
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: "); 
		name = sc.next();
		
		
		
		if(name.startsWith("��")) { //�达�� �����ϴ� �ܾ�
			System.out.println("�达�Դϴ�.");
		} else {
			System.out.println("�达�� �ƴմϴ�.");
		}

	}

}
