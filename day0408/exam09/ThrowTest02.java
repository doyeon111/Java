package exam09;

import java.io.IOException;

public class ThrowTest02 {

	public static void main(String[] args) {
		System.out.println("hello");

		
		try {
			throw new IOException("����� ���� �߻�"); //�ݵ�� ����ó�� �ؾ���.
		} catch(IOException e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}
	}

}
