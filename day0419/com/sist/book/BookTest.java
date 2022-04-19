package com.sist.book;

import java.util.ArrayList;
import java.util.Scanner;

import com.sist.dao.BookDAO;
import com.sist.dao.OrdersDAO;
import com.sist.vo.BookVO;
import com.sist.vo.OrdersVO;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ����ȣ �Է��� ���Ͽ� ������ ����
		String publicsher;

		// ����ȣ�� �Է¹޴´�
		System.out.print("���ǻ縦 �Է��ϼ���: ");
		publicsher = sc.next();

		// �ش���� �ֹ������� �˻��ϱ� ���Ͽ� OrderDAO��ü�� �����Ѵ�.
		BookDAO dao = new BookDAO();

		// dao�� �޼ҵ带 ȣ���Ͽ� ���� �ֹ������� �˻��Ѵ�.
		ArrayList<BookVO> list = dao.listBook(publicsher);

		// ������ ���
		System.out.println("������ȣ\t" + "�����̸�\t\t" + "���ǻ�\t" + "����\t");

		// ����Ʈ�� ��� �ֹ������� ��� ���
		for (BookVO vo : list) {
			System.out.println(vo.getBookid() + "\t" 
					+ vo.getBookname() + "\t\t" 
					+ vo.getPublicsher() + "\t"
					+ vo.getPrice());
		}

	}

}
