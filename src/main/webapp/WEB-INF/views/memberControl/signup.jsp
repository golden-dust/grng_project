<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sign up</title>
</head>
<body>
	<%@ include file="../fix/header_logout.jsp" %>
	<fieldset>
		<legend>회원 가입</legend>
		<form action="signupOk">
			<table>
				<tr>
					<td><label for="memId">아이디 </label></td>
					<td>
						<input type="text" name="memId" id="memId">
						<input type="button" class="checkBtn" name="idCheckBtn" id="idCheckBtn" value="중복확인">
					</td>
				</tr>
				<tr>
					<td>이메일 </td>
					<td>
						<input type="text" name="memEmail" id="memEmail">
						<input type="button" class="checkBtn" name="emailCheckBtn" id="emailCheckBtn" value="중복확인">
					</td>
				</tr>
				<tr>
					<td><label for="memPw">비밀번호 </label></td>
					<td>
						<input type="password" name="memPw" id="memPw">
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
					<td><input type="text" name="memName" id="memName"></td>
				</tr>
				<tr>
					<td>닉네임 </td>
					<td><input type="text" name="memNickname" id="memNickname"></td>
				</tr>
				<tr>
					<td>성별 </td>
					<td>
						<input type="radio" name="memGender" value="female"> 여성 
						<input type="radio" name="memGender" value="male"> 남성
					</td>
				</tr>
				<tr>
					<td>전화번호 </td>
					<td>
						<input type="text" name="memMobile" id="memMobile" placeholder="01012341234">
						<input type="button" class="checkBtn" name="mobileCheckBtn" id="mobileCheckBtn" value="중복확인">
					</td>
				</tr>
			</table>
			<div class="submitArea">
				<input type="submit" value="회원가입">
			</div>
		</form>
	</fieldset>
	
	<%@ include file="../fix/footer.jsp" %>
</body>
</html>