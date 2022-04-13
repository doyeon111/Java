package exam03;

import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

public class URLTest {

	public static void main(String[] args) {
		try {

			// ���ͳ� ���� ������ü�� ����
			URL url = new URL("http://hanbit.co.kr/store/books/new_book_list.html"); // �Ѻ����ǻ��� ���γ���å �������� ���

			// �� ������ ������ �о���̱� ���� ��Ʈ���� ����
			InputStream is = url.openStream(); // url �� ���½�Ʈ���� ���ؼ� input��Ʈ���� ������ �� �ִ�.

			// �� ���� �о���� byte���� �迭�� �����
			byte[] data = new byte[100]; // �� ���� 100����Ʈ�� �о��

			// ��Ʈ���� ���� �о�� ���ڿ��� �� ��Ƴ��� ������ �����.
			String str = ""; // �ʱ�ȭ

			// ��� �ݺ������Ѵ�.
			while (true) {

				// ��Ʈ���� ���� �����͸� �о���δ�.
				int re = is.read(data);

				// �� �̻� �о���� ���� ������ �ݺ����� Ż��
				if (re == -1) {
					break;
				}

				// �о���� data�� ���ڿ��� ����� �����Ѵ�.
				str = str + new String(data, "utf-8"); //���ڵ� ����� utf-8���� ���ش�.
				
				
				//�ٽ� �о���̱� ���Ͽ� �迭�� ����ش�. (�� �ڿ� �����Ⱚ�� ��µǱ� ������ �迭�� ��������)
				//�迭�� ����ֱ� ���Ͽ� 0���� ��� ä���.
				Arrays.fill(data, (byte)0); //byte������ ĳ�����Ͽ� ����ش�.
			}

			// ������ ��ü���ڿ��� ���
			System.out.println(str);

			// ����� ���� ��Ʈ���� �ݾ��ش�.
			is.close();

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
