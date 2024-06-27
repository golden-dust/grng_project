<%@page import="com.blnk.grng.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이 페이지</title>
<style>
	.wrapper {
		display: flex;
		align-items: center;
		justify-content: center;
		margin: 20px 0 20px 0;
	}
</style>
</head>
<body>
	<%@ include file="../fix/header_login.jsp" %>
	<div class="wrapper">
		<div class="ses">
			<table cellpadding="3">
				<tr>
					<td><label for="memId">아이디 </label></td>
					<td>${user.memId}</td>
				</tr>
				<tr>
					<td>이메일 </td>
					<td>${user.memEmail}</td>
				</tr>
				<tr>
					<td>이름 </td>
					<td>${user.memName}</td>
				</tr>
				<tr>
					<td>닉네임 </td>
					<td>${user.memNickname}</td>
				</tr>
				<tr>
					<td>성별 </td>
					<td>${user.memGender}</td>
				</tr>
				<tr>
					<td>전화번호 </td>
					<td>${user.memMobile}</td>
				</tr>
				<tr>
					<td>가입일 </td>
					<td>${user.memDate}</td>
				</tr>
			</table>
		</div>
	</div>
	<div class="wrapper">
		<div>
			<button onclick="window.location.href='register-pet'">나의 반려 등록하기</button> 
			<button onclick="window.location.href='modify-info'">나의 정보 수정하기</button>
		</div>
		
		<div>
			
		</div>
	</div>
	<%@ include file="../fix/footer.jsp" %>
	
</body>
</html>