package programming216;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
	public static Scanner sc; // ��ĳ�ʸ� �������� ����ϱ� ����.

	public static void printMenu() {
		System.out.println("==========================================");
		System.out.println("1. å ���");
		System.out.println("2. å �˻�");
		System.out.println("3. ��� å ���");
		System.out.println("4. ����");
		System.out.println("==========================================");
		System.out.print("��ȣ�� �Է��Ͻÿ�: ");

	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		// Book []bookList = new Book[100];
		ArrayList<Book> list = new ArrayList<Book>(); // �迭�� ���� ������ �ʰ� ����ؼ� ����
		//������ ������ ���� ����Ʈ�� �����Ѵ�.
		int menu; // �޴��� �����ϱ� ���� ������ �����Ѵ�.
		
		
		//���Ḧ ���� �޴� 4�� �Է����� �ʴ� �� ��� �����Ѵ�.
		while (true) {
			printMenu(); //�޴��� ���
			menu = sc.nextInt(); //�޴��� �Է�
			if (menu == 4) { //�Է��� �޴��� 4�̸� �ݺ����� 
				break; //Ż��
			}

			switch (menu) { //������ �޴��� ����
			case 1: 
				insertBook(list); //�޴��� 1�̸� ������ ����ϱ� ���� �޼ҵ带 ȣ��
				break;
			case 2:
				searchBook(list); //�޴��� 2�̸� ������ �˻��ϱ� ���� �޼ҵ带 ȣ��
				break;
			case 3:
				printBook(list); //�޴��� 3�̶�� ��� ������ ����ϱ� ���� �޼ҵ带 ȣ��
				break;
			}
		}
		
		System.out.println("���α׷��� �����Ͽ����ϴ�."); //�޴��� 4�� �Է��Ͽ� �ݺ����� Ż�������� ���α׷��� �����Ͽ��ٰ� ���

	}

	//�ݺ��� �ȿ��� �޴��� ����ϱ� ���� �޼ҵ带 �����. (��� ������ ����ϱ� ���� �޼ҵ�)
	public static void printBook(ArrayList<Book> list) {
//		for (int i = 0; i < list.size(); i++) {
		for(int i=0; i<Book.count; i++) { //����Ʈ�� ��� ������ �� ��ŭ �ݺ������Ͽ�
			System.out.println(list.get(i)); //������ �ϳ��� ������� �ͼ� ���
		}
	}

	//������ �˻��ϱ� ���� �޼ҵ�
	public static void searchBook(ArrayList<Book> list) {
		String title; //�˻��� �������� �Է��ϱ� ���� ����
		int score = -1;  //�˻��� ������ ������ �����ϱ� ���� ����
		
		
		//ã�� �������� �Է�
		System.out.print("ã���� �ϴ� �������� �Է��ϼ���: ");
		title = sc.next();
		
		
		for (int i = 0; i < Book.count; i++) { //����Ʈ�� ��� ������ �� ��ŭ �ݺ������Ͽ�
			Book b = list.get(i); //������ �ϳ��� �������� b�� ����

			if (b.title.equals(title)) { // ������ ����� b�� ������� �Է��� ã�� �������� ��ġ�ϴٸ� 
				score = b.score;	//�� ������ ������ ����
			}
		}
		//���� ã�� �������� ����Ʈ�� �������� �ʴ´ٸ� score�� -1�� �����ϰ� �ִ�.
		
		if(score != -1) { //ã�µ����� ����Ʈ�� �־��ٸ� 
			System.out.println(title + "������ ������ " + score + " �Դϴ�."); //������ ���
		} else { //ã�� ������ ����Ʈ�� ���ٸ�
			System.out.println(title + "������ ������ �����ϴ�."); //���ٰ� ���
		}

		

	}
	
	//������ ����ϱ� ���� �޼ҵ�
	public static void insertBook(ArrayList<Book> list) {
		String title;  //����� ������ �̸��� �����ϱ� ���� ����
		int score; //����� ������ ������ �����ϱ� ���� ����
		System.out.print("����: ");
		title = sc.next();
		System.out.print("����: ");
		score = sc.nextInt();
		
		//�����̸��� ������ ������� ���� Book ��ü�� ����
		Book book = new Book(title, score);
		//������ Book�� ����Ʈ�� ��´�.
		list.add(book);
		System.out.println("������ ������ ����Ͽ����ϴ�."); //����ߴٰ� �޽����� ���

	}

}
