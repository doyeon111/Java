package day0331;
//�����, ������, �����, ������, �ֿ츲
//28, 27, 27, 25, 26
//�迭�� �̿��Ͽ� 2���� ��ճ��̸� ����Ͽ� ����ϱ�.
public class ArrayTest02 {

	public static void main(String[] args) {
		int []data = {28, 27, 27, 25, 26};
		
		int total = 0;
		int avg;
		
		for(int i=0; i<data.length; i++) {
			total += data[i];
			
		}
		avg = total / data.length; //data.length: �������� ���̸� �˷��ִ� ��
		
		System.out.println("2���� ��ճ���: " + avg);

	}

}
