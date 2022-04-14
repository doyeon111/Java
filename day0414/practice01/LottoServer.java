package practice01;

//0413 ���� 
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class LottoServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9000);
			System.out.println(" ** ������ �����Ǿ����ϴ�. **");

			while (true) {
				Socket socket = server.accept();

				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();

				Random r = new Random();

				TreeSet<Integer> set = new TreeSet<Integer>();

				while (true) {
					if (set.size() >= 6) {
						break;
					}
					set.add(r.nextInt(45) + 1);
				}

				// set�� ��� �����͸� ������� �ϳ��� ������ ����ͼ� Ŭ���̾�Ʈ���� ����������.
				// set�� ��Ҹ� �ϳ��� ������ ��������� Iterator�� �����.
				Iterator<Integer> iter = set.iterator();
				while (iter.hasNext()) {
					int n = iter.next();
					os.write(n);
					Thread.sleep(200);
				}
				System.out.println("Ŭ���̾�Ʈ���� �ζǹ�ȣ�� �����Ͽ����ϴ�.");
				os.close();
				is.close();
				socket.close();

			}

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
