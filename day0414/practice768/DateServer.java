//package practice768;
//
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Date;
//import java.util.Random;
//
//public class DateServer {
//
//	public static void main(String[] args) {
//		Date today = new Date(); //date�� �̿��ϱ� ����
//		
//		int year = today.getYear() + 1900;
//		int month = today.getMonth() + 1; //0~11�̱� ������ + 1�� �����ش�.
//		int date = today.getDate();
//		int hour = today.getHours();
//		int minute = today.getMinutes();
//		int second = today.getSeconds();
//
//		try {
//			// 1. ServerSocket�� �����Ѵ�.
//			ServerSocket server = new ServerSocket(9000);
//
//			// 2. Ŭ���̾�Ʈ�� ������ ���� �� ���� ���� ������
//			while (true) {
//				// 4. Ŭ���̾�Ʈ�� ������ �����Ѵ�. (��ȯ�ϴ� �޼ҵ� Socket)
//				Socket socket = server.accept(); // ���� ��ü�� ��ȯ�Ѵ�.
//				System.out.println("** Ŭ���̾�Ʈ�� �����Ͽ����ϴ�. **");
//
//				// 5. �����͸� �ְ���� ��Ʈ���� ����
//				InputStream is = socket.getInputStream();
//				OutputStream os = socket.getOutputStream();
//				
//				// 6. �����͸� �ְ�޴´�.
//				// ������ Ŭ���̾�Ʈ���� ���� ���� 10���� ����� �����ֵ��� ����.
//
//					
//					
//					//������� ������ Ŭ���̾�Ʈ���� ������.
//					os.write(n); //������ ������
//					
//					Thread.sleep(200); //0.2�� ������ ���ð�
//					
//				}
//				
//				System.out.println("Ŭ���̾�Ʈ���� �����͸� ��� �����½��ϴ�.");
//				
//				// 7. ����ߴ� �ڿ��� �ݾ��ش�.
//				is.close();
//				os.close();
//				socket.close();
//			}
//
//		}catch(
//
//	Exception e)
//	{
//		System.out.println("���ܹ߻�: " + e.getMessage());
//	}
//
//}
//
//}
