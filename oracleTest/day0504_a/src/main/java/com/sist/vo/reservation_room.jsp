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
	
	//모든 객실을 조회
	try {
		String sql = "select r_no, r_type, fee from room r";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@192.168.0.7:1521:XE";
		String user = "c##scott";
		String pwd = "tiger";
		Connection conn = DriverManager.getConnection(url, user, pwd);
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		 
		%>
		
		객실번호: <select name="r_no">
		<%
			while(rs.next()) {
				int r_no = rs.getInt(1);
				String r_type = rs.getString(2);
				int fee = rs.getInt(3);
				%>
				
				<option value="<%=r_no %>"><%=r_no %>/<%=r_type %>/<%=fee %> </option>
				<% 
				
			}
		%>
		</select><br>
		
		<% 
		
		rs.close();
		pstmt.close();
		conn.close();
		
	} catch(Exception e) {
		System.out.println("예외발생: "+ e.getMessage());
	}

%>

체크인: <input type="text" name="checkin" value="<%=checkin %>"><br>
체크아웃: <input type="text" name="checkout" value="<%=checkout %>"><br>
투숙인원: <input type="text" name="cnt"><br>
연락처: <input type="text" name="rv_phone"><br>
고객번호: <input type="text" name="c_no"><br>
사원번호: <input type="text" name="e_no"><br>
<input type="submit" value="예약">
<input type="reset" value="취소">

</form>


</body>
</html>
