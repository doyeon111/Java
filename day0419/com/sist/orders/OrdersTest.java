package com.sist.orders;

import java.util.ArrayList;
import java.util.Scanner;

import com.sist.dao.OrdersDAO;
import com.sist.vo.OrdersVO;

public class OrdersTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 고객번호 입력을 위하여 변수를 선언
		int custid;

		// 고객번호를 입력받는다
		System.out.print("고객번호를 입력하세요: ");
		custid = sc.nextInt();

		// 해당고객의 주문내역을 검색하기 위하여 OrderDAO객체를 생성한다.
		OrdersDAO dao = new OrdersDAO();

		// dao의 메소드를 호출하여 고객의 주문내역을 검색한다.
		ArrayList<OrdersVO> list = dao.listOrder(custid);

		// 제목을 출력
		System.out.println("주문번호\t" + "고객번호\t" + "도서번호\t" + "구매가격\t" + "구매일\t");

		// 리스트에 담긴 주문내역을 모두 출력
		for(OrdersVO vo : list) {
			System.out.println(vo.getOrderid()+ "\t" +
								vo.getCustid()+ "\t" +
								vo.getBookid()+ "\t" +
								vo.getSaleprice()+ "\t" +
								vo.getOrderdate());
		}
		
	}

}
