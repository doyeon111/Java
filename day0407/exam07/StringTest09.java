package exam07;

public class StringTest09 {

	public static void main(String[] args) {
		String data = "hello java";
		int n = data.indexOf('e'); //j�� ���°�� �������� (���ڰ� �ߺ��� �� ��� ���� �տ� �ִ� ��°�� ��� , a�� 7��°)
		int n2 = data.indexOf("java"); //java��� ���ڰ� ���°�� �������� (indexOf)
		
		System.out.println(n);
		System.out.println(n2);
		
		System.out.println("--------------------------------");
		
		int n3 = data.lastIndexOf("a"); //a��� ���ڸ� ���������� ã�´�. ������, �ε����� ���� ���� ���ʺ���(lastIndexOf)
		System.out.println(n3);
		
		String data2 = data.replace("java", "oracle"); //data2�� java���� oracle�� ���ڰ� �ٲ�� ��.
		System.out.println(data2);
		System.out.println(data);// ������ data�� ���� ������ �ʴ´�.
	}

}
