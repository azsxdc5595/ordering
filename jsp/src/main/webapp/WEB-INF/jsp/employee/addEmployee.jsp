<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/employee/add" method="post">
姓名:<input type="text" name="name"><br>
帳號:<input type="text" name="username"><br>
密碼:<input type="password" name="password"><br>
連絡電話:<input type="text" name="number" oninput="value=value.replace(/[^\d]/g,'')"><br>
<input type="radio" name="type" value="2">經理
<input type="radio" name="type" value="1">課長
<input type="radio" name="type" value="0">社員
<input type="submit" value="ok">
</form>
</body>
</html>