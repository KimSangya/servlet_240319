<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>길이 변환 서버</title>
</head>
<body>
	<%
		int cm = Integer.parseInt(request.getParameter("cm"));
		String types[] = request.getParameterValues("transform"); 
	%>
	<h1>길이 변환 결과</h1>
	<%= cm %>
	<hr>
	<%
	if(types != null) {
		for(String type : types) {
			if(type.equals("inch")) {
				double inch = cm*0.393701;
				out.print(inch + "in<br>");
			} else if(type.equals("feet")) {
				double ft = cm*0.032808;
				out.print(ft + "ft<br>");
			} else if(type.equals("yard")) {
				double yard = cm*0.010936;
				out.print(yard + "yard<br>");
			} else if(type.equals("meter")){
				double meter = cm*0.01;
				out.print(meter + "m<br>");
			} else {
				out.print("선택되지 않았습니다.");
			}
		}
	}
	%>
</body>
</html>