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
<title>�������� ���</title>
</head>
<body>
	<form action="searchCNameR_input.jsp" method="post">
		����: <input type="text" name="cname"> <input type="submit" value="���������˻�">
		<!-- �Է¹��� ���� ������ ���ؼ� submit -->

	</form>

	<hr>

	<%
	//�̸��� �ѱ۷� ���� ������ �ѱ� ������ �Ѵ�.
	request.setCharacterEncoding("euc-kr");

	//����ڰ� �Է��� ����� ���ǻ�� �޾� ������ ����
	String cname = request.getParameter("cname");

	//����� ���ǻ���� null�� �ƴ� �� �����ͺ��̽� ����
	if (cname != null) {
		//String sql = "select * from reservation r, customer c where r.cno = c.cno and cname = '"+ cname +"'";
		String sql ="select cname,tname,taddr,title,price,seat,rdate from customer c,theater t,play p,reservation r where cname='"+cname+"'"+
						" and c.cno=r.cno and t.tno=p.tno and r.tno=t.tno and p.pno=r.pno";
		

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.35.171:1521:XE";
			String user = "c##madang";
			String pwd = "madang";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String cname1 = rs.getString(1);
				String tname = rs.getString(2);
				String taddr = rs.getString(3);
				String title = rs.getString(4);
				int price = rs.getInt(5);
				int seat = rs.getInt(6);
				Date rdate = rs.getDate(7);
			

				out.print(cname + ", " + tname + ", " + taddr + ", " + title + ", " + price + ", " + seat + ", " + rdate + "<br>");

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