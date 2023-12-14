<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="utf-8"
    import="com.example.demo.vo.porder"
    import="com.example.demo.vo.member"%>
 <%
 /*
 1.擷取 session-->p
 2.確認-->訂單
 */
 
 
 porder p=(porder)session.getAttribute("P");
 
 member m=(member)session.getAttribute("M");
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
			<td colspan=2 align=center>
			<%=m.getName() %> 這是你的訂位資料
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
			<a href="/porder/porder">回上一頁</a>
			<a href="/porder/finish">確定</a>
	</table>

</body>
</html>