<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 2번 스크립틀릿(scriptlet) 문법을 사용해서 주어진 점수들의 평균을 구하세요.
		int[] scores = {81, 90, 100, 95, 80};
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double total = sum/scores.length; // 결과
		
		// 3번
		List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
		Iterator<String> iter = scoreList.iterator();
		int correct = 0; // jsp는 printwriter가 내장 객체라서 out로만 작성해도 나오게 됨.
		while(iter.hasNext()) {
			String line = iter.next();
			if(line.equals("O")) {
				correct += 10;
			}
		}
		
		// 4번
		String birthday = "20010820";
		int year = Integer.parseInt((birthday.substring(0, 3)));
		int old = 2024 - year;
	%>
	
	<%!
		// 1번 n까지의 합계를 구하는 함수
		public int sumTotal(int numbers) {
			int sum = 0;
			for(int i = 1; i <= numbers; i++) {
				sum += i;
			}
			return sum;
		}
	%>
	
	<b> 1. 1부터 50까지의 합은 <%= sumTotal(50) %>입니다. </b><br>
	<b> 2. 평균 점수는 <%= total %>점입니다.</b><br>
	<b> 3. 채점 결과는 <%= correct %>점입니다.</b><br>
	<b> 4. 20010820의 나이는 <%= old %>세 입니다.</b><br>
</body>
</html>