<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<%
		int a1 = Integer.parseInt(request.getParameter("a1"));
		int a2 = Integer.parseInt(request.getParameter("a2"));
		String operation = request.getParameter("operation");
		
		double result = 0;
		if(operation.equals("+")) {
			result = a1 + a2;
		} else if(operation.equals("-")) {
			result = a1 - a2;
		} else if(operation.equals("*")) {
			result = a1 * a2;
		} else {
			result = a1 / a2;
		}
	%>
	<div class="container display-4">
		계산 결과<br>
		<%= a1 %> <%= operation %> <%= a2 %> = <span class="text-primary"><%= result%></span>
	</div>
</body>
</html>