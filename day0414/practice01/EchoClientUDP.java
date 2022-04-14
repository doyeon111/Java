package practice01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Scanner;

public class EchoClientUDP {

	public static void main(String[] args) {
		try {
			//UDP��Ŀ����� �����͸� �ְ�޴� ������ �����ͱ׷� ��Ŷ�̴�.
			//���ŵ� �����͸� ���� �� �ʿ��� �迭�� �����.
			byte []data = new byte[100];
			
			//�����͸� ������ ���� �����ͱ׷� ��Ŷ�� ���� ���� �ʿ��� InetAddress ��ü�� ����
			InetAddress addr = InetAddress.getByName("192.168.35.171");
			
			//��Ʈ��ȣ�� ������ ����
			int port = 9002;
			
			//UDP��Ŀ��� �����͸� �ְ�޴� �޼ҵ带 �����ִ� �����ͱ׷� ������ �����Ѵ�.
			DatagramSocket socket = new DatagramSocket();
			
			//UDP��Ŀ��� �����͸� �ְ�޴� ������ �����ͱ׷� ��Ŷ������ ����
			DatagramPacket packet = null;
			
			//������ �޾Ƹ��ϴ� �����͸� �ޱ� ���� ��Ŷ�� �����.
			DatagramPacket rePacket = new DatagramPacket(data, data.length);
			
			//������ �������� �ϴ� ���ڿ��� �Է¹ޱ� ���� ���� ����
			String msg;
			
			//Ű����� ���� �Է¹ޱ� ���Ͽ� ��ĳ�ʸ� ����
			Scanner sc = new Scanner(System.in);
			
			
			//����Ͽ� ����
			while(true) {
				
				//Ű����κ��� ������ ���� ���ڿ��� �Է�
				System.out.println("������ ���� ���ڿ��� �Է�:  ");
				msg = sc.next();
				
				//����, �Է��� ���ڿ��� q!��� ����
				if(msg.equals("q!")) {
					break;
				}
				
				//�Է��� ���ڿ�, �������� �ּ�, ��Ʈ��ȣ�� ���� UDP������� �����͸� ������ ���� ������ �����ͱ׷� ��Ŷ ��ü�� ����
				packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, port);
				
				//UDP ������� �����͸� ������ ���� ��ü�� �����ͱ׷� ��Ĺ�� ���� �����͸� ������.
				socket.send(packet);
				
				//������ �޾Ƹ� �ϴ� �����͸� �޴´�.
				socket.receive(rePacket);
				
				System.out.println("�����κ��� �ٽ� �޾Ƹ��� ������: " + new String(data).trim());
				
				//���������� ������ ���Ͽ� �迭�� ����ش�.
				Arrays.fill(data, (byte)0);
				
			}
			
			//����ߴ� �ڿ��� �ݾ��ش�.
			socket.close();
			System.out.println("*** �����Ͽ����ϴ�. ***");
			
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
