<%@page import="java.sql.PreparedStatement"%>
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
<%
	request.setCharacterEncoding("utf-8");
	int r_no = Integer.parseInt(request.getParameter("r_no"));
	String r_type = request.getParameter("r_type");
	int fee = Integer.parseInt(request.getParameter("fee"));
	
	try {
		
		if(request.getParameter("r_no") != null) {
			
			//사용자의 입력값을 가지고 sql 명령어를 만들 때에 입력값이 들어가는 자리에 ?로 대신할 수 있다.
			String sql = "insert into room(r_no, r_type, fee) values (?,?,?)";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@192.168.0.7:1521:XE";
			String user = "c##scott";
			String pwd = "tiger";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			
			//?가 있는 sql를 실행시키기 위해서는 PreparedStatement를 이용
			//PreparedStatement를 생성할 때에 ?가 있는 sql 명령어를 매개변수로 준다.
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//sql 명령어에 있는 ?의 순서대로 값을 설정
			//자료형에 따라 문자열이면 setString(물음표위치, 값)
			//			정수		setInt(물음표위치, 값)
			pstmt.setInt(1, r_no);
			pstmt.setString(2, r_type);
			pstmt.setInt(3, fee);
			
			//preparedStatement 실행시에 sql을 매개변수로 전달하지 않는다.
			//sql을 매개변수로 전달하면 ?가 결정되지 않은 채로 sql을 실행하려고 한다.
			int re = pstmt.executeUpdate();
			
			
			if(re == 1) {
				out.print("객실을 등록하였습니다.");
			} else {
				out.print("객실 등록에 실패하였습니다.");
			}
			
			pstmt.close();
			conn.close();
		}
		
 
	} catch (Exception e) {
		System.out.println("예외발생: " + e.getMessage());
	}
	
	
	
%>

</body>
</html>
