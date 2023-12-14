<%@ page contentType="text/html;charset=UTF-8" language="java"
	import="com.example.demo.vo.porder" 
	import="java.util.*"%>
<% List<porder> p2 =(List<porder>)session.getAttribute("porders2");%>



<html>
<head>
<title>所有訂位</title>
</head>
<body>

	<h2>所有訂位</h2>

	<table border="1">
		<thead>
			<tr>
				<th>桌號</th>
				<th>會員編號</th>
				<th>訂單時間</th>
				<th>訂位人數</th>
				<th>訂位電話</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (porder porder : p2) {
			%>
			<tr>
				<td><%=porder.getDeskno()%></td>
				<td><%=porder.getMemberno()%></td>
				<td><%=porder.getOrdertime()%></td>
				<td><%=porder.getNumber()%></td>
				<td><%=porder.getPhone()%></td>
				<td><a href="/porder/gotoUpdate?porderId=<%=porder.getId()%>&ordertime=<%=new java.text.SimpleDateFormat("yyyy-MM-dd").format(porder.getOrdertime())%>&number=<%=porder.getNumber()%>&phone=<%=porder.getPhone() %>">更改訂位資訊</a></td>
				<td><a href="/porder/gotoDelete?porderId=<%=porder.getId()%>">取消訂位</a></td>
			<%
			}
			%>
			
		</tbody>
	</table>

</body>
</html>