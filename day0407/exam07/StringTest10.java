package exam07;

public class StringTest10 {

	public static void main(String[] args) {
		String data = "�赵��, �����, ������, ������, ��â��"; //5���� �̸��� ,�� ���еǰ� �ִ�.
//		String[] split(String regex);
		
		//split �޼ҵ带 �̿��Ͽ� ��� ����� �̸��� ����غ���.
		
		String []arr = data.split(", "); //split�� ���� ,�� �̿��Ͽ� ���
		
		for(String name: arr) {
			System.out.println(name);
		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		

	}
	//�迭�� ����: length
	//���ڿ��� ����: length()

}
