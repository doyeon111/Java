package day0404;

import java.util.Scanner;

public class StudentTest02 {

	public static void main(String[] args) {
		Student[] data = new Student[5]; // �Ʊ� ����� �� Student.java�� �ִ� �迭�� ������.
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < data.length; i++) {
			data[i] = new Student(); // Ŭ������ �ڷ����� �ٷ� ����� �� ���� ������ data[0] = new Student(); ��� ��ü�� ��������� ����� �� �ִ�.
			System.out.print((i + 1) + "��° �л��� �̸��� �Է��ϼ���: ");
			data[i].name = sc.next();

			System.out.print((i + 1) + "��° �л��� ���������� �Է��ϼ���: ");
			data[i].kor = sc.nextInt();

			System.out.print((i + 1) + "��° �л��� ���������� �Է��ϼ���: ");
			data[i].eng = sc.nextInt();

			System.out.print((i + 1) + "��° �л��� ���������� �Է��ϼ���: ");
			data[i].math = sc.nextInt();
;

			data[i].tot = data[i].kor + data[i].eng + data[i].math;
			data[i].avg = data[i].tot / 3.0;
		}
		
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i].name + "\t"
								+ data[i].kor + "\t"
								+ data[i].eng + "\t"
								+ data[i].math + "\t"
								+ data[i].tot + "\t"
								+ data[i].avg + "\t");
		}
		
		//�����ϱ�
		System.out.println("----------------------------------------------------------------");
		System.out.println("*** ���������� �����ϱ� ***");

		for(int i=0; i<data.length; i++) {
			for(int j=i+1; j<data.length; j++) {
				if(data[j].tot > data[i].tot) {
					Student temp = data[i]; //����,����,����,����,����� �� �� �ֱ� ������ Student�� temp�� ������ָ� ��.
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i].name + "\t"
								+ data[i].kor + "\t"
								+ data[i].eng + "\t"
								+ data[i].math + "\t"
								+ data[i].tot + "\t"
								+ data[i].avg + "\t");
		}
	}

}
