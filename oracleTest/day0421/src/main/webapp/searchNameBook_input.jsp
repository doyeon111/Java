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
<title>�������� ���� ���� �˻�</title>
</head>
<body>
	<form action="searchNameBook_input.jsp" method="post">
		����: <input type="text" name="name"> <input type="submit" value="������� �˻�">
		<!-- �Է¹��� ���� ������ ���ؼ� submit -->

	</form>

	<hr>

	<%
	//�̸��� �ѱ۷� ���� ������ �ѱ� ������ �Ѵ�.
	request.setCharacterEncoding("euc-kr");

	//����ڰ� �Է��� ������ �޾� ������ ����
	String name = request.getParameter("name");

	//������ null�� �ƴ� �� �����ͺ��̽� ����
	if (name != null) {
		String sql = "select bookname" +
						" from book" +
						" where bookid not in (select bookid" + 
												" from orders" + 
												" where custid = (select custid " + 
																	" from customer" + 
																	" where name = '" + name + "'))";
		

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.35.171:1521:XE";
			String user = "c##sist";
			String pwd = "sist";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String bookname = rs.getString(1);
				
			

				out.print(bookname + "<br>");

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