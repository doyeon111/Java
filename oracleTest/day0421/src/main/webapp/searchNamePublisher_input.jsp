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
	<form action="searchNamePublisher_input.jsp" method="post">
		����: <input type="text" name="name"> ���ǻ��: <input type="text"
			name="publicsher"> <input type="submit" value="���ų��� �˻�">
		<!-- �Է¹��� ���� ������ ���ؼ� submit -->

	</form>

	<hr>

	<%
	//�̸��� �ѱ۷� ���� ������ �ѱ� ������ �Ѵ�.
	request.setCharacterEncoding("euc-kr");

	//����ڰ� �Է��� ����� ���ǻ�� �޾� ������ ����
	String name = request.getParameter("name");
	String publicsher = request.getParameter("publicsher");

	//����� ���ǻ���� null�� �ƴ� �� �����ͺ��̽� ����
	if (name != null && publicsher != null) {
		String sql = "select c.custid, name, publicsher, b.bookname, price, saleprice, orderdate " +
					" from customer c, book b, orders o " +
					" where c.custid = o.custid and b.bookid = o.bookid and" +
					" name = '"+name+"' and publicsher = '"+publicsher+"' order by orderdate desc, b.bookname";
		

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.35.171:1521:XE";
			String user = "c##sist";
			String pwd = "sist";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int custid = rs.getInt(1);
				String name1 = rs.getString(2);
				String publicsher1 = rs.getString(3);
				String bookname = rs.getString(4);
				int price = rs.getInt(5);
				int saleprice = rs.getInt(6);
				Date orderdate = rs.getDate(7);
			

				out.print(custid + ", " + name + ", " + publicsher + ", " + bookname + ", " + price + ", " + saleprice + ", " + orderdate + "<br>");

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