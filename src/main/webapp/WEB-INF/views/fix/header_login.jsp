<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	header {
		background-color: lavender;
		font-weight: bold;
		font-size: 30pt;
		height: 50px;
		padding: 0 10px 0 10px;
	}
	
	h5 {
		disply: inline;
		color: grey;
	}

	a {
		color: inherit;
		text-decoration: none;	
	}
	
	a:active {
		color: black;
	}
	
		
	button {
		background-color: lavender;
		color: grey;
		border: none;
		border-radius: 10px;
		font-weight: bold;
		font-size: 20pt;
	}
	
	button:hover {
		color: black;
		transition: 0.7; 
	}
	
	button:active {
		background-color: white;
		color: black;
	}
	
</style>
</head>
<body>
	<header>
		<h5><a>GRNG</a></h5>
		<span class="header-btn">
			<button onclick=""><img src="https://img.icons8.com/ios-glyphs/30/000000/search--v1.png"/></button>
            <button>로그인</button>
            <button>회원가입</button>
		</span>
	</header>
</body>
</html>