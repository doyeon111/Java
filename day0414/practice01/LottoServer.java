package practice01;

//0413 과제 
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
			System.out.println(" ** 서버가 가동되었습니다. **");

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

				// set에 담긴 데이터를 순서대로 하나씩 끄집어 내어와서 클라이언트에게 내보내보기.
				// set의 요소를 하나씩 끄집어 내어오려면 Iterator로 만든다.
				Iterator<Integer> iter = set.iterator();
				while (iter.hasNext()) {
					int n = iter.next();
					os.write(n);
					Thread.sleep(200);
				}
				System.out.println("클라이언트에게 로또번호를 전송하였습니다.");
				os.close();
				is.close();
				socket.close();

			}

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
