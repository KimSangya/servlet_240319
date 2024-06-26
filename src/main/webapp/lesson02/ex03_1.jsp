<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post form태그 - 서버 페이지</title>
</head>
<body>
	<%
		String nickname = request.getParameter("nickname");
		String hobby = request.getParameter("hobby");
		String animal = request.getParameter("animal");
		String[] foodArr = request.getParameterValues("food");
		String fruit = request.getParameter("fruit");
	%>
	
	<table border="1">
		<tr>
			<th>별명</th>
			<td><%= nickname %></td>
		</tr>
		<tr>
			<th>취미</th>
			<td><%= hobby %></td>
		</tr>
		<tr>
			<th>선호하는 동물</th>
			<td><%= animal %></td>
		</tr>
		<tr>
			<th>선호하는 음식</th>
			<td>
			<% 
				if(foodArr != null) {
					String result = ""; // 이친구가 null로 사용하면 안됨. why? 아무것도 없는 String에 넣을수없기 때문에.
					for(String food : foodArr) {
						result += food + ",";
					}
					// 맨 뒤에 붙은 ,(콤마) 제거
					// abc -> ab만 추출만 한다고 생각하면 substring(0, 2) => 2 => 문자열 길이 -1
					result = result.substring(0, result.length()-1);
					out.print(result);
				}
			%>
			</td>
		</tr>
		<tr>
			<th>선호하는 과일</th>
			<td><%= fruit %></td>
		</tr>
	</table>
</body>
</html>