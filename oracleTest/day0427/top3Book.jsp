<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
		String sql = "select * from top4";
	
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@192.168.35.47:1521:XE";
			String user = "c##sist";
			String pwd = "sist";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int bookid = rs.getInt(1);
				String bookname = rs.getString(2);
				int cnt = rs.getInt(3);
				out.print(bookid + ", " + bookname + ", " + cnt + "<br>");
				
			}
			rs.close();
			stmt.close();
			conn.close();
			
			
			
		} catch(Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}
	
	%>
</body>
</html>