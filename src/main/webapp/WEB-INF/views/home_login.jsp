<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<%@ include file="./fix/header_login.jsp" %>
	<% HttpSession session = request.getSession(); %>
	<h1>
		Hello <%= (String)session.getAttribute("sid") %>!
	</h1>

	<%@ include file="./fix/footer.jsp" %>
</body>
</html>
