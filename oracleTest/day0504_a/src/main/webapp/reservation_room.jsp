<%@page import="com.sist.vo.EmpVO"%>
<%@page import="com.sist.dao.EmpDAO"%>
<%@page import="com.sist.vo.CustomerVO"%>
<%@page import="com.sist.dao.CustomerDAO"%>
<%@page import="com.sist.vo.RoomVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.dao.RoomDAO"%>
<%@page import="java.sql.ResultSet"%>
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
<h2>객실예약</h2>
<form action="reservationOK.jsp" method="post"> 

<%
	String checkin = request.getParameter("checkin");
	String checkout = request.getParameter("checkout");
	
	//예약가능한 객실목록을 RoomDAO의 메소드를 통하여 읽어온다.
	RoomDAO roomDAO = new RoomDAO();
	ArrayList<RoomVO> list = roomDAO.avaliableRoomList(checkin, checkout);
	
	//모든 고객 목록을 customerDAO의 메소드를 통해 읽어온다.
	
	CustomerDAO	customerDAO = new CustomerDAO();
	ArrayList<CustomerVO> c_list = customerDAO.customerList();
	
	//모든 사원의 목록을 EmpDAO의 메소드를 통해 읽어온다.
	EmpDAO empDAO = new EmpDAO();
	ArrayList<EmpVO> e_list = empDAO.EmpList();
	
	
%>

<select name="r_no">
	<%
		//RoomDAO가 반환한 예약가능한 객실목록만큼 반복실행한다.
		//반복실행하여 option태그를 만든다.
		for(RoomVO room : list) {
			%>
				<option value="<%=room.getR_no()%>"><%=room.getR_no() %>/<%=room.getR_type() %>/<%=room.getFee() %></option>
			<%

		
		}
	%>
</select><br>
	
	

체크인: <input type="text" name="checkin" value="<%=checkin %>"><br>
체크아웃: <input type="text" name="checkout" value="<%=checkout %>"><br>
투숙인원: <input type="text" name="cnt"><br>
연락처: <input type="text" name="rv_phone"><br>
고객번호: 
<select name="c_no">
	<%
		for(CustomerVO c : c_list) {
			%>
		<option value="<%=c.getC_no() %>"><%=c.getC_no() %>/<%=c.getC_name() %>/<%=c.getC_type() %></option>
	  <% 
	}
	%>
</select><br>
사원번호: 
<select name="e_no">
	<%
		for(EmpVO e : e_list) {
			%>
			<option value="<%=e.getE_no()%>"><%=e.getE_no() %>/<%=e.getE_name() %></option>
			<% 
		}
	%>
</select><br>
<input type="submit" value="예약">
<input type="reset" value="취소">

</form>


</body>
</html>
