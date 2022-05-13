<%@page import="com.sist.dao.ReservationDAO"%>
<%@page import="com.sist.vo.ReservationVO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String checkin = request.getParameter("checkin");
	String checkout = request.getParameter("checkout");
	int cnt = Integer.parseInt(request.getParameter("cnt"));
	String rv_phone = request.getParameter("rv_phone");
	int c_no = Integer.parseInt(request.getParameter("c_no"));
	int r_no = Integer.parseInt(request.getParameter("r_no"));
	int e_no = Integer.parseInt(request.getParameter("e_no"));
	
	//사용자가 입력한 정보를 ReservationVO 객체에 담는다.
	ReservationVO r = new ReservationVO();
	
	r.setCheckin(checkin);
	r.setCheckout(checkout);
	r.setC_no(c_no);
	r.setCnt(cnt);
	r.setRv_phone(rv_phone);
	r.setR_no(r_no);
	r.setE_no(e_no);
	
	//데이터베이스에 접근하여 insert를 담당하는 dao객체를 생성
	ReservationDAO dao = new ReservationDAO();
	
	//dao를 통해 예약테이블에 레코드를 추가하는 메소드를 호출한다.
	int re = dao.insertReservation(r); 
	
	if(re == 1) {
		out.println("예약을 성공하였습니다.");
	} else {
		out.println("예약에 실패하였습니다.");
	}
%>
</body>
</html>
