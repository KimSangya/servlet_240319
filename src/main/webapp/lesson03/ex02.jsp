<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h1>회원가입</h1>
	
	<!-- 
		흐름(flow)
		1. 회원가입 : ex02.jsp(가입 화면) -> ex02_insert 서블릿(insert 쿼리 실행) -> ex02_1.jsp(사용자 목록 화면, select 쿼리를 사용해서 테이블로 구성하는 화면)
		2. 
	 -->
	
	<form method="post" action="/lesson03/ex02_insert">
		<p>
			<b>이름 : </b>
			<input type="text" name="name" placeholder="이름을 입력해주세요">
		</p>
		<p>
			<b>생년월일 : </b>
			<input type="text" name="yyyymmdd" placeholder="생년월일을 입력해주세요">
		</p>
		<
			<b>이메일 : </b>
			<input type="text" name="email" placeholder="이메일을 입력해주세요">
		</p>
		<p>
			<b>자기소개 : </b><br>
			<textarea name="introduce" rows="5" cols="50"></textarea>
		</p>
		<p>
			<input type="submit" value="회원가입">
		</p>
	</form>
</body>
</html>