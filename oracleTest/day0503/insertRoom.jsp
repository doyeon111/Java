<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>객실등록</h2>
	<hr>
	<form action="insertRoomOK.jsp" method="post">
		객실번호: <input type="text" name="r_no"><br>
		객실종류: <input type="text" name="r_type"><br>
		가격	 : <input type="text" name="fee"><br>
		<input type="submit" value="등록">
		<input type="reset" value="취소">
	</form>
</body>
</html> 
