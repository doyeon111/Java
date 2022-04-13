package exam03;

import java.net.DatagramPacket;

//UDPSender 192.168.0.2 / 9001  / �ȳ�?  ���� �迭�� 0, 1, 2��°
//		    192.168.0.2 / 9001  / ����ִ� �ڹ�

import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) {
		try {

			// ���α׷� ���� �ÿ� ���޹޴� ù ��°�� �������� �ϴ� �����͸� �����ϴ� ��ǻ���� ip�ּ� �̴�.
			String ip = args[0];

			// ���α׷� ���� �ÿ� ���޹޴� �� ��°�� ����� ��Ʈ��ȣ�̴�.
			int port = Integer.parseInt(args[1]);

			// ���α׷� ���� �ÿ� ���޹޴� �� ��°�� ������ �����̴�.
			String msg = args[2];

			// ������ ������ ����Ʈ�� ��ȯ�Ѵ�.
			byte[] data = msg.getBytes();

			// ip�ּҸ� ���� InetAddress ��ü�� ����
			InetAddress addr = InetAddress.getByName(ip);

			// UDP ����� ������ ���۴����� ��Ŷ�� ����
			DatagramPacket packet = new DatagramPacket(data, data.length, addr, port);

			// �����͸� �����ϱ� ���� �����ͱ׷� ���� ��ü�� ����
			DatagramSocket socket = new DatagramSocket();

			// �����͸� ����
			socket.send(packet);

			// ����ߴ� �ڿ��� �ݾ��ش�.
			socket.close();

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
