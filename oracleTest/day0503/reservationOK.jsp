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
	
	
	String sql = "insert into reservation(rv_no, checkin, checkout, cnt, rv_phone, c_no, r_no, total, e_no) "+
				"values((select nvl(max(rv_no),0) + 1  from reservation),"+ //자동으로 rv_no가 생성될 수 있게 설정
			"?,?,?,?,?,?,0,?)";
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@192.168.0.7:1521:XE";
		String user = "c##scott";
		String pwd = "tiger";
		Connection conn = DriverManager.getConnection(url, user, pwd);
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//물음표에 해당하는 값 설정
		pstmt.setString(1, checkin);
		pstmt.setString(2, checkout);
		pstmt.setInt(3, cnt);
		pstmt.setString(4, rv_phone);
		pstmt.setInt(5, c_no);
		pstmt.setInt(6, r_no);
		pstmt.setInt(7, e_no);
		
		int re = pstmt.executeUpdate();
		if(re == 1) {
			out.print("예약에 성공하였습니다.");
		} else {
			out.print("예약에 실패하였습니다.");
		}
		
		pstmt.close();
		conn.close(); 
		
	}catch(Exception e) {
		System.out.println("예외발생: "+ e.getMessage());
	}
%>
</body>
</html>
