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
	<form action="searchEmpDept_input.jsp" method="post">
		�μ���: <input type="text" name="dname"> <input type="submit"
			value="�����˻�">
		<!-- �Է¹��� ���� ������ ���ؼ� submit -->

	</form>

	<hr>

	<%
	//�̸��� �ѱ۷� ���� ������ �ѱ� ������ �Ѵ�.
	request.setCharacterEncoding("euc-kr");

	//����ڰ� �Է��� �μ����� �޾Ƽ� ������ ����
	String dname = request.getParameter("dname");

	//�μ����� null�� �ƴ� �� �����ͺ��̽� ����
	if (dname != null) {
		String sql = "select ename from dept d, emp e where d.dno = e.dno and dname = '"+ dname + "'";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.35.171:1521:XE";
			String user = "c##sist";
			String pwd = "sist";
			Connection conn = DriverManager.getConnection(url, user, pwd);
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
			System.out.println("���ܹ߻�: " + e.getMessage());
		}
	}
	%>
</body>
</html>