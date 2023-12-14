<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/product/add" method="post">
	編號:<input type="text" name="productno"><br>
	品名:<input type="text" name="productname"><br>
	價目:<input type="text" name="price" oninput="value=value.replace(/[^\d]/g,'')"><br>
	<input type="submit" value="ok">
	</form>
</body>
</html>