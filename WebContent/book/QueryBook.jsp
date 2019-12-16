<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询图书</title>
</head>

<body background="../photo/4.jpg">

<form method="post" action="findTitleManageTitlesAction.action">
	<input type="text" name="context" id="context" value="">
	<input type="submit" name="submit" value="查询图书">
</form>
<form method="post" action="findTypeManageTitlesAction.action">
	<input type="text" name="book.title">
	<input type="submit" name="submit" value="书名查询">
</form>
</body>
</html>