<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 완료</title>
</head>
<body>
	<%@ include file="./fix/header_login.jsp" %>
	<br>
	<div>
		<h3>회원 가입 완료</h3>
		<p>${memNickname}님, 회원가입을 축하합니다!<br><br>
		가입하신 아이디는 ${memId}입니다.</p>
	</div>
	<div>
		<a>반려 정보 입력하기</a>&emsp;
		<a href="/">홈으로 이동하기</a>
	</div>
	
	<%@ include file="./fix/footer.jsp" %>
</body>
</html>