package practice01;
//0414����1��
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class EchoServerUDP {

	public static void main(String[] args) {
		try {
			//UDP ��Ŀ��� �����͸� �ְ�ޱ� ���ؼ��� �����ͱ׷� ������ �̿�
			DatagramSocket socket = new DatagramSocket(9002);
			
			//�����͸� ���� �迭�� �����.
			byte []data = new byte[100];
			
			//UDP ��Ŀ��� �����͸� �ְ�޴� ������ �����ͱ׷���Ŷ�� ����
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			//��� ����
			while(true) {
				
				//UDP ��Ŀ��� �����͸� �ְ�޴� ����� �����ִ� �����ͱ׷����� ��ü�� ���Ͽ� �����͸� �޴´�.
				socket.receive(packet);
				
				//���� �����͸� �״�� �޾Ƹ��Ѵ�.
				socket.send(packet);
				
				//������ ���ڿ��� q!�̸� ����
				String msg = new String(data).trim();
				
				if(msg.equals("q!")) {
					break;
				}
				
				System.out.println("Ŭ���̾�Ʈ�κ��� ���ŵ� ������: " + msg);
				
				//���������� ������ ���Ͽ� �迭�� ����ش�.
				Arrays.fill(data, (byte)0);
			}
			
			//����ߴ� �ڿ��� �ݾ��ش�.
			socket.close();
			
			
			
		}catch(Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
