package com.sist.orders;

import java.util.ArrayList;
import java.util.Scanner;

import com.sist.dao.OrdersDAO;
import com.sist.vo.OrdersVO;

public class OrdersTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ����ȣ �Է��� ���Ͽ� ������ ����
		int custid;

		// ����ȣ�� �Է¹޴´�
		System.out.print("����ȣ�� �Է��ϼ���: ");
		custid = sc.nextInt();

		// �ش���� �ֹ������� �˻��ϱ� ���Ͽ� OrderDAO��ü�� �����Ѵ�.
		OrdersDAO dao = new OrdersDAO();

		// dao�� �޼ҵ带 ȣ���Ͽ� ���� �ֹ������� �˻��Ѵ�.
		ArrayList<OrdersVO> list = dao.listOrder(custid);

		// ������ ���
		System.out.println("�ֹ���ȣ\t" + "����ȣ\t" + "������ȣ\t" + "���Ű���\t" + "������\t");

		// ����Ʈ�� ��� �ֹ������� ��� ���
		for(OrdersVO vo : list) {
			System.out.println(vo.getOrderid()+ "\t" +
								vo.getCustid()+ "\t" +
								vo.getBookid()+ "\t" +
								vo.getSaleprice()+ "\t" +
								vo.getOrderdate());
		}
		
	}

}
