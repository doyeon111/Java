package day0331;

public class Practice129_10 {

	public static void main(String[] args) {
		double []data = {1.0, 2.0, 3.0, 4.0};
		double sum=0, max=0;
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
			sum += data[i];  //i���� ����
			
			if(data[i] > max) { //�ִ밪 ���
				max = data[i];
			}
		}
		System.out.println();
		System.out.println("���� " + sum);
		System.out.println("�ִ밪�� " + max);
	}

}
