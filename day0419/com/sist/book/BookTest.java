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

		// 고객번호 입력을 위하여 변수를 선언
		String publicsher;

		// 고객번호를 입력받는다
		System.out.print("출판사를 입력하세요: ");
		publicsher = sc.next();

		// 해당고객의 주문내역을 검색하기 위하여 OrderDAO객체를 생성한다.
		BookDAO dao = new BookDAO();

		// dao의 메소드를 호출하여 고객의 주문내역을 검색한다.
		ArrayList<BookVO> list = dao.listBook(publicsher);

		// 제목을 출력
		System.out.println("도서번호\t" + "도서이름\t\t" + "출판사\t" + "가격\t");

		// 리스트에 담긴 주문내역을 모두 출력
		for (BookVO vo : list) {
			System.out.println(vo.getBookid() + "\t" 
					+ vo.getBookname() + "\t\t" 
					+ vo.getPublicsher() + "\t"
					+ vo.getPrice());
		}

	}

}
