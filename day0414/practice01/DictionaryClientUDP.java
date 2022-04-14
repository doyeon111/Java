package practice01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Scanner;

public class DictionaryClientUDP {

	public static void main(String[] args) {
		try {
			// UDP����� �����͸� �ְ� ���� �����ͱ׷����� ��ü�� ����
			DatagramSocket socket = new DatagramSocket();
			
			System.out.println("*** Ŭ���̾�Ʈ�� �غ�Ǿ����ϴ�. ***");

			// Ű���� �Է��� ���� ��ĳ�� ��ü�� ����
			Scanner sc = new Scanner(System.in);

			// ����ڷκ��� ����ܾ� �Է��� ���� ������ ����
			String eng;

			// �����κ��� �����Ǿ� ���ŵ� �ѱ�� �����ϱ� ���� ������ ����
			String kor;

			// UDP����� ������ ���۴����� �����ͱ׷���Ŷ ������ ����
			DatagramPacket packet = null;
			
			
			//���ŵ� �����͸� �����ϱ� ���� �迭�� ����
			byte []data = new byte[100];
			
			//�����κ��� ������ �ѱ�� �����ϱ� ���� �����͸� ���� ��Ŷ�� ����
			DatagramPacket rePacket = new DatagramPacket(data, data.length);

			// ��Ŷ�� ������ ���� �ʿ��� InetAddress ��ü�� ����
			InetAddress addr = InetAddress.getByName("192.168.35.171");

			// ��Ŷ�� ������ ���� �ʿ��� ��Ʈ��ȣ�� ������ ����
			int port = 9004;

			// ��ӹݺ��Ͽ� ����
			while (true) {
				// ��������� ������ ����ܾ �Է¹޴´�.
				System.out.print("������ ����ܾ �Է��ϼ���: ");
				eng = sc.next();

				// �Է¹��� ����ܾ��, ������ �ּ�, ��Ʈ��ȣ�� ���� UDP����� ������ ���۴����� ��Ŷ�� ����
				packet = new DatagramPacket(eng.getBytes(), eng.getBytes().length, addr, port);

				// ������ ��Ŷ�� ������ ������.
				socket.send(packet);

				// ����, �Է��� ����ܾ "q!"�̸� ����
				if (eng.equals("q!")) {
					break;
				}
				
				//�����κ��� ������ �ѱ�� �����Ѵ�.
				socket.receive(rePacket);
				
				//���ŵ� �����Ͱ� ��� �迭�� ���� ���ڿ��� ����
				kor = new String(data);
				
				//������ �ѱ�� ����Ѵ�.
				System.out.println("�����κ��� �����Ͽ� ������ ������: " + kor);
				
				//���� ������ ������ ���Ͽ� �迭�� ����ش�.
				Arrays.fill(data, (byte)0);
			}
			socket.close();
			System.out.println("***�����Ͽ����ϴ�.***");

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
