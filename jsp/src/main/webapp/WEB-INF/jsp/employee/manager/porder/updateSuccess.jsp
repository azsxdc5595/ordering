<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="utf-8"
    import="com.example.demo.vo.porder"%>
 <%
 porder p=(porder)session.getAttribute("U2");
 
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<table width=400 align=center border=1>
		<tr>
			<td colspan=2 align=center>修改訂位完成 , 這是新的訂位詳細資料
		<tr>
			<td width=100>桌號
			<td><%=p.getDeskno() %>
		<tr>
			<td>日期
			<td><%=p.getOrdertime() %>
		<tr>
			<td>人數
			<td><%=p.getNumber() %>
		<tr>
			<td>電話
			<td><%=p.getPhone() %>
		<tr>
			<td colspan=2 align=center>
			<a href="/employee/system">進入管理系統</a>
	</table>
</body>
</html>