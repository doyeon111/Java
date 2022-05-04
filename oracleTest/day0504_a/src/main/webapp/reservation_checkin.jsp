<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>객실예약</h2>
	<hr>
	<form action="reservation_room.jsp" method="post">
		체크인 날짜 : <input type="text" name="checkin"><br>
		체크아웃 날짜: <input type="text" name="checkout"><br>
		<input type="submit" value="객실조회">
	</form>
</body>
</html>