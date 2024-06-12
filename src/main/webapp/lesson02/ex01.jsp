<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex01 - jsp</title>
</head>
<body>
	<!-- html 주석 : 소스 보기에서 보인다는 점. -->
	<%-- JSP 주석 : 소스 보기에서 보이지 않는다.--%>
	
	<%
		// 자바 문법 시작
		// scriptlet 로직이 들어가는 문법
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
	%>
	<b>합계</b>
	<input type="text" value="<%= sum %>">
	<br>
	
	<%!
		// 자바 구문 : 선언문 - 클래스 같은 느낌(예:Person)
		
		// 필드와 메소드를 선언 할 수 있다.
		// 필드 선언
		int num = 100;
	
		// 메소드
		public String getHelloWorld() {// 추후 사용할 때, 세미클론을 붙이지 않아도 됨.
			return "Hello world!";
		}
	%>
	
	<%= getHelloWorld() %>
	<br>
	<%= num + 200 %>
</body>
</html>