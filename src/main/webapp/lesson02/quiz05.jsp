<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>길이 변환</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container"> 
		<form method = "post" action = "/lesson02/quiz05_1.jsp">
			<span class="display-4">사칙연산 계산기</span>
			<div class="d-flex align-items-end">
				<input type="text" name="a1" class="form-control col-2 mr-2">
				<select name="operation" class="form-control col-1 mr-2">
					<option>+</option>
					<option>-</option>
					<option>*</option>
					<option>/</option>
				</select>
				<input type="text" name="a2" class="form-control col-2 mr-2">
				<button type="submit" class="btn btn-success">계산하기</button>
			</div>
		</form>
	</div>
</body>
</html>