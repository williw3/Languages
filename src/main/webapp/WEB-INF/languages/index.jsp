<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Languages Home</title>
</head>
<body>
	<h1>All Languages</h1>
	<table>
    	<thead>
        	<tr>
            	<th>Name</th>
            	<th>Creator</th>
            	<th>Version</th>
            	<th>Action</th>
       		</tr>
    	</thead>
    	<tbody>
        	<c:forEach items="${languages}" var="lang">
        	<tr>
            	<td><a href="/languages/${lang.id}"><c:out value="${lang.name}"/></a></td>
            	<td><c:out value="${lang.creator}"/></td>
            	<td><c:out value="${lang.version}"/></td>
            	<td><a href="/languages/${lang.id}/edit">Edit</a></td>
        	</tr>
        	</c:forEach>
    	</tbody>
	</table>
<a href="/languages/new">New Language</a>
</body>
</html>