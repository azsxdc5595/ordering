<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.example.demo.vo.member"%>
<%
member m = (member) session.getAttribute("M");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	<h3><%=m.getName()%>，歡迎訂位 </h3>
<form action="/porder/confirm" method="post">
桌號:<Input type="text" name="deskno"><br>
日期:<input type="date" name="ordertime"><br>
人數:<input type="text" name="number" oninput="value=value.replace(/[^\d]/g,'')"><br>
電話:<input type="tel" name="phone"><br>
<input type="submit" value="ok">
</form>
</body>
</html>