package day0404;

import java.util.Scanner;

//5���� �̸�, ����, ����, ������ �Է¹޾� ����, ����� ���ϰ� ���� ������ �����Ͽ� ����ϴ� ���α׷�

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String []name = new String[5];
		int []kor = new int[5];
		int []eng = new int[5];
		int []math = new int[5];
		int []tot = new int[5];
		double []avg = new double[5];
		
		for(int i=0; i<name.length; i++) {
			System.out.print((i+1)+ "��° �л��� �̸��� �Է��ϼ���: ");
			name[i] = sc.next();
			
			System.out.print((i+1)+ "��° �л��� ���������� �Է��ϼ���: ");
			kor[i] = sc.nextInt();
			
			System.out.print((i+1)+ "��° �л��� ���������� �Է��ϼ���: ");
			eng[i] = sc.nextInt();
			
			System.out.print((i+1)+ "��° �л��� ���������� �Է��ϼ���: ");
			math[i] = sc.nextInt();
			
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i] / 3.0;
		}
		
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		
		for(int i =0; i<name.length; i++) {
			System.out.println(name[i] + "\t"
								+ kor[i] + "\t"
								+ eng[i] + "\t"
								+ math[i] + "\t"
								+ tot[i] + "\t"
								+ avg[i]);
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("*** ���� ������ ���� ***");
		
		//����
		for (int i=0; i<name.length; i++) {
			for(int j=i+1; j<name.length; j++) {
				if(tot[j] > tot[i]) { //�̸�, ����, ����, ����, ����, ��յ� �� �ٲپ� �־�� ��.
					String name_temp = name[i];
					name[i] = name[j];
					name[j] = name_temp; 
					
					int kor_temp = kor[i];
					kor[i] = kor[j];
					kor[j] = kor_temp; 
					
					int eng_temp = eng[i];
					eng[i] = eng[j];
					eng[j] = eng_temp; 
					
					int math_temp = math[i];
					math[i] = math[j];
					math[j] = math_temp; 
					
					int tot_temp = tot[i];
					tot[i] = tot[j];
					tot[j] = tot_temp; 
					
					double avg_temp = avg[i];
					avg[i] = avg[j];
					avg[j] = avg_temp; 
					
				}
				
				
			}
			
		}
		for(int i =0; i<name.length; i++) {
			System.out.println(name[i] + "\t"
								+ kor[i] + "\t"
								+ eng[i] + "\t"
								+ math[i] + "\t"
								+ tot[i] + "\t"
								+ avg[i]);
		}
	}

}
