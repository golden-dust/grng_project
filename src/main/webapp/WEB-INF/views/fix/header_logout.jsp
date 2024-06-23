<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	header {
		display: flex;
		align-items: center;
	}
	
	h1.header-logo {
		flex-grow: 1;
	}
	
	h1.header-logo {
		display: inline-block;
		vertical-align: middle;
		color: white;
		margin: 0.5rem;
		padding: 0;
	}
	
	nav {
		display: inline-block;
		vertical-align: middle;
	}
	
	ul {
		list-style: none;
		margin: 0;
		padding: 0;
		display: flex;
	}
	
	li.icon {
		flex-basis: 25%;
	}
	
	header {
		background: cadetblue;
		padding: 10px;
	}
	
	a.header-logo {
		text-decoration: none;
		color: inherit;
	}
	
	a.navbar-btn {
		display: block;
		text-align: center;
		margin: .25rem;
		padding: .5rem 1rem;
		text-decoration: none;
		font-weight: bold;
		color: white;
		background: teal;
	}
	
	a.navbar-btn:hover {
		background: yellowgreen;
	}
	
	html {
		box-sizing: border-box;
	}
	
	*, *:before, *:after {
		box-sizing: inherit;
	}
	
</style>
</head>
<body>
	<header>
		<h1 class="header-logo"><a class="header-logo" href="./">GRNG</a></h1>
		<nav class="navbar">
			<ul class="navebar_menu">
				<li><a class="navbar-btn" href="">게시판</a></li>
				<li><a class="navbar-btn" href="login">로그인</a></li>
				<li><a class="navbar-btn" href="signup">회원가입</a></li>
			</ul>
		</nav>
	</header>
</body>
</html>