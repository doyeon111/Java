<%@page import="com.sist.vo.ScoreVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.dao.ScoreDAO"%>
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
	ScoreDAO dao = new ScoreDAO();
	ArrayList<ScoreVO> list = dao.listScore();
%>

	<h3>학생이름</h3>
	<ul>
	
	<%
		for(ScoreVO s : list) {
			%>
					<li><%=s.getName() %>
			<% 
			
		}
	
	%>
	</ul>
</body>
</html>