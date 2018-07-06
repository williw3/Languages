<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Language Details Page</title>
</head>
<body>
	<h1><c:out value="${thisLang.id}"/></h1>
	<p>Name: <c:out value="${thisLang.name}"/></p>
	<p>Creator: <c:out value="${thisLang.creator}"/></p>
	<p>Version: <c:out value="${thisLang.version}"/></p>
	<a href="/languages/${thisLang.id}/edit">Edit Language</a>
	<form action="/languages/${thisLang.id}" method="post">
    	<input type="hidden" name="_method" value="delete">
    	<input type="submit" value="Delete">
	</form>
</body>
</html>