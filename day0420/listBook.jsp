<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>�������</h2>
	<hr>
	
	<!-- jsp���� �ڹ� ������ ���ַ��� <%%> �ȿ����ش�. -->
	<%
		String sql = "select * from book";
	
		try{ 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist", "sist");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int bookid = rs.getInt(1);
				String bookname = rs.getString(2);
				String publicsher = rs.getString(3);
				int price = rs.getInt(4);
				
				
				out.print(bookid + ", " + bookname + ", " + publicsher + ", " + price + "<br>"); //�������� ���
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}
	
	
	%>
	
</body>
</html>