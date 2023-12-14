<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.example.demo.vo.employee"%>
<%
employee e=(employee)session.getAttribute("E");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/employee/changeSuccess" method="post">
	<table border=1>
		<tr>
			<td colspan=3 aligh=center><%=e.getName()%>，請輸入想要的新密碼
		<tr>
			<td width=100>原本密碼
			<td><%=e.getPassword() %>
			<td>新密碼
			<input type="password" name="employeePassword" required><br>
		<tr>
			<td colspan=3 align=center>
			<a href="/employee/managerEmployees">回到管理員工資料</a>
			<input type="hidden" name="employeeName" value="<%=e.getName() %>">
			<input type="submit" value="確定">
	</table>
	</form>
</body>
</html>