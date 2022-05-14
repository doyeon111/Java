<%@page import="com.sist.vo.MemberVO"%>
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
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	String self = request.getParameter("self");
	
	MemberVO m = new MemberVO(id, pwd, name, self);
	MemberDAO dao = new MemberDAO();
	int re = dao.insertMember(m);
	if(re == 1) {
		%>
			회원가입에 성공하였습니다.
		<%
	} else {
		%>
			회원가입에 실패하였습니다.
		<%
	}
%>
</body>
</html> 
