<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.example.demo.vo.product"%>
<%product p=(product)session.getAttribute("product"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>新品項<%=p.getProductname() %>成功上架</h1>
<a href="/employee/product">回管理商品資料</a>
</body>
</html>