<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<style>
	div {
		padding: 3px;
		margin: 2px;
	}
	
	div.wrapper {
		display: grid;
		align-items: center;
		justify-content: center;
	}
	
	div.fhrmdlsduddur {
		margin: 10px 0 10px 0;
		padding: 0 5px 10px 5px;
		width: 250px;
		heigh: 400px;
	}
</style>
</head>
<body>
	<%@ include file="../fix/header_logout.jsp" %>
	<div class="wrapper">
		<div class="fhrmdlsduddur">
			<div>
				<h2>로그인</h2>
				${failMsg}
			</div>
			<div>
			<form action="loginOk">
				<div>
					<label for="memId">아이디</label>
				</div>
				<div>
					<input name="memId" id="memId" type="text" size="23">
				</div>
				<div>
					<label for="memPw">비밀번호</label>
				</div>
				<div>
					<input name="memPw" id="memPw" type="password" size="23">
				</div>
				<div>
					<br>
					<input type="button" value="아이디/비밀번호 찾기" onclick="window.find-id-or-pw">
					<input type="submit" value="로그인">
				</div>
			</form>
			</div>
		</div>
	</div>
	<%@ include file="../fix/footer.jsp" %>
</body>
</html>