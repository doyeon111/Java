<%@page import="java.sql.Date"%>
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
	<h2>개발팀 직원 목록</h2>
	<hr>
	
	<!-- jsp에서 자바 문법을 써주려면 <%%> 안에써준다. -->
	<%
		//String sql = "select * from emp where dno in(30, 40)";
	
		String sql = "select * from emp e, dept d where dname like '개발%' and e.dno = d.dno";
	
		try{ 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist", "sist");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int eno = rs.getInt(1); 
				String ename = rs.getString(2);
				int dno = rs.getInt(3);
				int salary = rs.getInt(4);
				int comm = rs.getInt(5);
				Date hiredate = rs.getDate(6);
				String phone = rs.getString(7);
				String addr = rs.getString(8);
				int mgr = rs.getInt(9);
				String job = rs.getString(10);
				
				
				out.print(eno + ", " + ename+ ", " + dno + ", " + salary + ", " + comm + ", " + hiredate + ", " + phone + ", " + addr + ", " + mgr + ", " + job +  "<br>"); //브라우저에 출력
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}
	
	
	%>
	
</body>
</html>
