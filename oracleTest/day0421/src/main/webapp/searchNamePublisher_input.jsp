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
		고객명: <input type="text" name="name"> 출판사명: <input type="text"
			name="publicsher"> <input type="submit" value="구매내역 검색">
		<!-- 입력받은 값을 보내기 위해서 submit -->

	</form>

	<hr>

	<%
	//이름이 한글로 오기 때문에 한글 설정을 한다.
	request.setCharacterEncoding("euc-kr");

	//사용자가 입력한 고객명과 출판사명 받아 변수에 저장
	String name = request.getParameter("name");
	String publicsher = request.getParameter("publicsher");

	//고객명과 출판사명이 null이 아닐 때 데이터베이스 연동
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
			System.out.println("예외발생: " + e.getMessage());
		}
	}
	%>
</body>
</html>