<%@page import="com.sist.vo.ScoreVO"%>
<%@page import="com.sist.dao.ScoreDAO"%>
<%@page import="java.util.ArrayList"%>
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
	int sumHTML = 0;
	int sumCSS = 0;
%>

<table border="1">
	<caption>1학기 성적</caption>
	<thead>
		<tr>
			<th>이름</th>
			<th>HTML</th>
			<th>CSS</th>
		</tr>
	</thead>
	<tbody>
	<%
		for(ScoreVO s : list) {
			sumHTML += s.getHtml(); //html의 값 누적
			sumCSS += s.getCss(); //css의 값 누적 
			%>
				<tr>
					<td><%=s.getName() %></td>
					<td><%=s.getHtml() %></td>
					<td><%=s.getCss() %></td>
				</tr>
			<% 
			//과목별 합계 출력
			
		}
	
	%>
	</tbody>
	<tfoot>
		<tr>
			<th>합계</th>
			<th><%=sumHTML %></th>
			<th><%=sumCSS %></th>
		</tr>
	</tfoot>
</table>
</body>
</html>
