<%@page import="com.sist.dao.EmpDAO"%>
<%@page import="com.sist.vo.EmpVO"%>
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
	EmpDAO dao = new EmpDAO();
	ArrayList<EmpVO> list = dao.listEmp();
%>

<h2>사원목록</h2>
<%
	for(EmpVO e: list) { 
		%>
			<details>
				<summary><%=e.getEname() %></summary>
				<div>
					사원번호: <%=e.getEno() %><br>
					사원이름: <%=e.getEname() %><br>
					부서번호: <%=e.getDno() %><br>
					급여: <%=e.getSalary() %><br>
					수당: <%=e.getComm() %><br>
					입사일: <%=e.getHiredate() %><br>
					전화번호: <%=e.getPhone() %><br>
					주소: <%=e.getAddr() %><br>
					관리자번호: <%=e.getMgr() %><br>
					직급: <%=e.getJob() %><br>
					이메일: <%=e.getEmail() %><br>
					주민번호: <%=e.getJumin() %><br>

					
				</div>
			</details>
		
		<% 
	}
%>
</body>
</html>
