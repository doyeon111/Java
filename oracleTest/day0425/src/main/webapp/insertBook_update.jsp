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
<!-- 도서번호와 도서가격을 입력받아 그 도서의 가격을 수정 -->
	<h2>도서 가격 수정</h2>
	<hr>
	<form action="insertBook_update.jsp" method="post">
		도서번호: <input type="text" name="bookid"><br>
		도서가격: <input type="text" name="price"><br>
		
		<input type="submit" value="수정">
	</form>
	
	<%
		//한글 설정 
		request.setCharacterEncoding("UTF-8");
		try {
			
			if(request.getParameter("bookid") != null) {
				
				int bookid = Integer.parseInt(request.getParameter("bookid"));
				String bookname = request.getParameter("bookname");
				String publisher = request.getParameter("publisher");
				int price = Integer.parseInt(request.getParameter("price"));
				
				String sql="update book set price='"+price+"' where bookid = "+bookid+"";
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@192.168.35.47:1521:XE";
				String user = "c##sist";
				String pwd = "sist";
				Connection conn = DriverManager.getConnection(url, user, pwd);
				Statement stmt = conn.createStatement();
				int re = stmt.executeUpdate(sql);
				//executeUpdate는 데이터베이스에 변동이 있는 명령을 실행할 때에 사용하며 성공적으로 명령을 수행한 레코드 수를 반환
				
				if(re == 1) {
					out.print("도서를 수정하였습니다. <br>");
					out.print(bookid +"번 도서의 가격이 "+price + "원으로 변경되었습니다.");
					
				} else {
					out.print("도서 수정에 실패하였습니다.");
				}
				
				stmt.close();
				conn.close();
			}
			
			
		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}
	
	
	%>
</body>
</html>
