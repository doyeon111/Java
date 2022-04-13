package exam03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class UDPReceiver {

	public static void main(String[] args) {
		try {
			// �����͸� �ְ�ޱ� ���� ���ϰ�ü�� ����
			DatagramSocket socket = new DatagramSocket(9001); // ��Ʈ��ȣ 9001��

			// ���� �����Ͱ� ��� �迭�� �����.
			byte[] data = new byte[100];

			// ���ŵ� �����͸� �ޱ����� �����ͱ׷� ��Ŷ�� ������
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			System.out.println("*** �����͸� ������ �غ� �Ǿ����ϴ�. ***");
			System.out.println("-----------------------------------------------------");

			// �����͸� ����Ͽ� �ޱ� ���Ͽ� ���� �����¿� �ִ�.
			while (true) {
				// ���ŵ� �����͸� �޴´�.
				socket.receive(packet);

				// ��Ŷ�� ���� �� �����͸� �������� �� byte �迭�� data�� ���ڿ��� �����.
				String msg = new String(data);

				// ���ŵ� ���ڿ��� ȭ�鿡 ���
				System.out.println("���ŵ� ������: " + msg.trim()); //������ �����ϰ� ���
				
				//���������͸� ���Ͽ� �迭�� �ʱ�ȭ��.(�����ִ� �����Ⱚ ������.)
				Arrays.fill(data, (byte)0);

			}

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
