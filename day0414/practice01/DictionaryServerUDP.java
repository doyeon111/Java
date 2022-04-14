package practice01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.HashMap;

public class DictionaryServerUDP {

	public static void main(String[] args) {
		// ����ܾ Ű���ϰ�, �ѱ�� ������ �ϴ� map�� ����
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("apple", "���");
		map.put("grape", "����");
		map.put("watermelon", "����");
		map.put("strawberry", "����");

		try {

			// UDP ����� �����͸� �ְ���� �����ͱ׷� ���� ��ü�� ����
			DatagramSocket socket = new DatagramSocket(9004);
			
			System.out.println("*** ������ �غ�Ǿ����ϴ�. ***");

			// ��Ŷ ������ �ʿ��� �迭�� �����.
			byte[] data = new byte[100];

			// UDP����� ������ ���۴����� ��Ŷ�� ����
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			//������ ������ ������ ���� ��Ŷ������ ����
			DatagramPacket rePacket = null;

			// Ŭ���̾�Ʈ�� ���� ���� �����͸� ����ؼ� �ޱ� ���Ͽ� ���ѷ����� ǥ��
			while (true) {
				// Ŭ���̾�Ʈ�κ��� �����͸� �޴´�.
				socket.receive(packet);

				// ���ŵ� �����Ͱ� ��� �迭�� ���� ���ڿ��� ����
				String eng = new String(data).trim();
				
				System.out.println("Ŭ���̾�Ʈ�κ��� ���ŵ� ������: " +eng);

				// ���� ���ŵ� ���ڿ��� q!��� ����
				if (eng.equals("q!")) {
					break;
				}

				// eng�� key�� �Ͽ� map���� �ѱ�� �̾ƿ´�.
				String kor = map.get(eng);

				// ���� ������ ��ϵ� �ܾ �ƴϸ� "����"�� ����
				if (kor == null) {
					kor = "����";
				}

				// ������ ������ kor�� ������ ���ؼ� �����ͱ׷� ��Ŷ�� �ʿ��ϴ�.
				//�̹� �����ִ� Ŭ���̾�Ʈ�κ��� ������ ���ؼ� ������� ��Ŷ�� ���
				//����Ŷ �ȿ��� �̹� ������ �ּҿ�, ��Ʈ��ȣ�� �ֱ� ������ �����͸� ���Ƴ���� �ȴ�.
				//�� ó�� ���� �����Ϳ� ���� ������ �ǰ�, ���� �����͸� ������ ���Ѵ�.
				//�������� ���� ��Ŷ�� ���� �����.
				
				
				//�����͸� ������ ���� ������ �ּҸ� ������ ��Ŷ���κ��� �޾ƿ´�.
				InetAddress reAddr = packet.getAddress();
				
				//�����͸� ������ ���� �������� port��ȣ�� �޾ƿ´�.
				int rePort = packet.getPort();
				
				//������ �����͸� �����ϱ� ���� ��Ŷ�� ����
				rePacket =  new DatagramPacket(kor.getBytes(), kor.getBytes().length, reAddr, rePort);
				

				// ������ �����͸� Ŭ���̾�Ʈ���� ��������.
				socket.send(rePacket);
				
				// ���������� ������ ���Ͽ� �迭�� ����ش�.
				Arrays.fill(data, (byte) 0);
			}
			
			socket.close();
			System.out.println("*** �����Ͽ����ϴ�. ***");
			

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}
	}

}
