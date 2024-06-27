<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
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
		<fieldset>
			<legend>회원 가입</legend>
			<form action="modify-info-ok">
				<table>
					<tr>
						<td><label for="memId">아이디 </label></td>
						<td>
							${user.memId}<input type="hidden" name="memId" id="memId" value="${user.memId}">
						</td>
					</tr>
					<tr>
						<td>이메일 </td>
						<td>
							<input type="text" name="memEmail" id="memEmail" value="${user.memEmail}">
							<input type="button" class="checkBtn" name="emailCheckBtn" id="emailCheckBtn" value="중복확인">
						</td>
					</tr>
					<tr>
						<td><label for="memPw">비밀번호 </label></td>
						<td>
							<input type="password" name="memPw" id="memPw" value="${user.memPw}">
						</td>
					</tr>
					<tr>
						<td>비밀번호 확인 </td>
						<td>
							<input type="password" name="memPw2" id="memPw2">
						</td>
					</tr>
					<tr>
						<td>이름 </td>
						<td>
							${user.memName}<input type="hidden" name="memName" id="memName" value="${user.memName}">
						</td>
					</tr>
					<tr>
						<td>닉네임 </td>
						<td><input type="text" name="memNickname" id="memNickname" value="${user.memNickname}"></td>
					</tr>
					<tr>
						<td>성별 </td>
						<td>
							${user.memGender}<input type="hidden" name="memGender" id="memGender" value="${user.memGender}">
						</td>
					</tr>
					<tr>
						<td>전화번호 </td>
						<td>
							<input type="text" name="memMobile" id="memMobile" value="${user.memMobile}">
							<input type="button" class="checkBtn" name="mobileCheckBtn" id="mobileCheckBtn" value="중복확인">
						</td>
					</tr>
					<tr>
						<td>가입일 </td>
						<td>
							${user.memDate}
						</td>
					</tr>
				</table>
				<div class="submitArea">
					<input type="submit" value="정보수정">
				</div>
			</form>
		</fieldset>
	</div>
	<%@ include file="../fix/footer.jsp" %>
</body>
</html>