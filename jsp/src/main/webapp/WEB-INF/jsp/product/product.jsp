<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.example.demo.vo.product"
    import="java.util.*"%>
<%List<product> p=(List<product>)session.getAttribute("products"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>菜單</h1>
	<table border=1>
		<thead>
			<tr>
				<th>菜色編號</th>
				<th>品名</th>
				<th>價目</th>
		</thead>
	
		<%for(product product:p){ %>
		<tbody>
		<tr>
			<td><%=product.getProductno() %></td>
			<td><%=product.getProductname() %></td>
			<td><%=product.getPrice() %></td>
	
		<%} %>
		</tbody>
	</table>
	<a href="/member/">回上一頁</a>
</body>
</html>