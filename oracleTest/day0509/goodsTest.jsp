<%@page import="com.sist.vo.GoodsVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.dao.GoodsDAO"%>
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
	GoodsDAO dao = new GoodsDAO();
	ArrayList<GoodsVO> list = dao.listGoods();
%>

<table border="1">
	<caption>상품목록</caption>
	<thead>
		<tr>
			<th>상품이름</th>
			<th>수량</th>
			<th>가격</th>
			<th>이미지</th>
		</tr>
	</thead>
	<tbody>
	<%
		for(GoodsVO s : list) {
			%>
				<tr>
					<td><%=s.getItem() %></td>
					<td><%=s.getQty() %></td>
					<td><%=s.getPrice() %></td>
					<td><img src="goods/<%=s.getFname() %>" width="50" height="50"></td>
				</tr>
			<% 

			
		}
	
	%>
	</tbody>
	<tfoot>
	</tfoot>
</table>
</body>
</html>