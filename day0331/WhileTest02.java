package day0331;

public class WhileTest02 {

	public static void main(String[] args) {
		
		int i = 1;
		boolean flag = false;
		while (!flag) { 
			System.out.println("hello");
			i++;
			if(i>3) {
				flag = true;
			}
		}
		System.out.println("����");
		System.out.println("i: " + i);
		
		
		

		/*
		int i = 1;
		boolean flag = true;
		while (flag) { //while���� ���ǽ��� ����� �ݵ�� boolean�̾�� �Ѵ�. (true, false)����.. true�� ��� ���̶�� ��.
			if(i > 3) { //i�� 3���� ũ�� Ż��
				break;
			}
			System.out.println("hello");
			
			i++;
		}
		System.out.println("����");
		System.out.println("i: " + i); //i�� ���� 4�� �Ǹ� Ż�� */
	}

}
