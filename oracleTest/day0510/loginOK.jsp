<%@page import="com.sist.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>로그인 처리 결과</h3>
	<hr>
	
	<%
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		MemberDAO dao = new MemberDAO();
		if(dao.isMember(id, pwd)) {
			%>
			로그인 되었습니다.
			<% 
		} else {
			%>
			로그인 실패하였습니다.
			<%
		}
		
	%>

</body>
</html> 
