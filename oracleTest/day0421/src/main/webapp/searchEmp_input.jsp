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
	<form action="searchEmp_input.jsp" method="post">
		관리자 이름: <input type="text" name="mname"> <input type="submit"
			value="부하직원 검색">
		<!-- 입력받은 값을 보내기 위해서 submit -->

	</form>

	<hr>

	<%
	//이름이 한글로 오기 때문에 한글 설정을 한다.
	request.setCharacterEncoding("euc-kr");

	//사용자가 입력한 관리자 이름을 받아서 변수에 저장
	String mname = request.getParameter("mname");

	//관리자 이름이 null이 아닐 때 데이터베이스 연동
	if (mname != null) {
		String sql = "select e.ename from emp e, emp m where e.mgr = m.eno and m.ename = '" + mname + "'";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist", "sist");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
		String ename = rs.getString(1);

		out.print(ename + "<br>");

			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}
	}
	%>
</body>
</html>
