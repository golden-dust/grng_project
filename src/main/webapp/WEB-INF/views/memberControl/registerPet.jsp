<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	
</style>
</head>
<body>
	<%@ include file="../fix/header_login.jsp" %>
	<div class="wrapper">
		<div>
			<div>
				<h2>반려 동식물 등록</h2>
				<span>귀엽고 멋진 반려를 등록해주세요!</span>
			</div>
			<div id="rform">
				<form action="registerPetOk">
					<div>
						<label for="petName">이름은</label> 
						<input type="text" name="petName" id="petName">
					</div>
					<div>
						<label for="petType">나의 반려는</label>  
						<select name="petType" id="petType">
							<option value="강아지">강아지</option>
							<option value="고양이">고양이</option>
							<option value="햄스터">햄스터</option>
							<option value="새">새</option>
							<option value="물고기">물고기</option>
							<option value="식물">식물</option>
							<option value="기타">기타</option>
						</select>
					</div>
					<div>
						<label for="petBreed">종류는</label> 
						<input type="text" name="petBreed" id="petBreed">
					</div>
					<div>
						<label for="petBd">생일은</label> 
						<input type="text" name="petBd" id="petBd" placeholder="2024-01-01">
					</div>
					<div>
						<span>성별은</span> 
						<input type="radio" name="petSex" id="male" value="male"> 
						<label for="male">수컷</label>
						<input type="radio" name="petSex" id="female" value="female"> 
						<label for="female">암컷</label>
						<input type="radio" name="petSex" id="na" value="na"> 
						<label for="na">해당없음</label>
					</div>
					<div>
						<input type="submit" value="등록">
					</div>
				</form>
			</div>
		</div>
	</div>
	<%@ include file="../fix/footer.jsp" %>
</body>
</html>