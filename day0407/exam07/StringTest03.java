package exam07;

public class StringTest03 {

	public static void main(String[] args) {
		char[] data = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

		String data1 = new String(data);
		String data2 = new String(data, 1, 3); // 인덱스 1번째부터 3번째 까지 출력

		System.out.println(data1);
		System.out.println(data2);
	}

}
