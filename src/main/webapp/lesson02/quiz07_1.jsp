<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장보기 목록</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
	<div class="d-flex justify-content-center">
		<span class="display-4">장보기 목록</span>
	</div>
		<table class="table">
			<thead>
			    <tr>
			      <th scope="col">메뉴</th>
			      <th scope="col">상호</th>
			      <th scope="col">품목</th>
			    </tr>
			  </thead>
			  <tbody>
			<%
				List<Map<String, Object>> list = new ArrayList<>();
				    Map<String, Object> map = new HashMap<String, Object>() {{ put("name", "버거킹"); put("menu", "햄버거"); put("point", 4.3); } };
				    	list.add(map);
				    map = new HashMap<String, Object>() {{ put("name", "BBQ"); put("menu", "치킨"); put("point", 3.8); } };
				    	list.add(map);
				    map = new HashMap<String, Object>() {{ put("name", "교촌치킨"); put("menu", "치킨"); put("point", 4.1); } };
				    	list.add(map);
				    map = new HashMap<String, Object>() {{ put("name", "도미노피자"); put("menu", "피자"); put("point", 4.5); } };
				    	list.add(map);
				    map = new HashMap<String, Object>() {{ put("name", "맥도날드"); put("menu", "햄버거"); put("point", 3.8); } };
				    	list.add(map);
				    map = new HashMap<String, Object>() {{ put("name", "BHC"); put("menu", "치킨"); put("point", 4.2); } };
				    list.add(map);
				    	map = new HashMap<String, Object>() {{ put("name", "반올림피자"); put("menu", "피자"); put("point", 4.3); } };
				    list.add(map);
				    
				    String menu = request.getParameter("menu");
				    
				    // 4점 이하 제외 체크됨 : "true" 체크 안됨 : null로 들어오게 됨.
				    String except = request.getParameter("except");
				    boolean exclude = except != null; // 체크가 되어있으면 -> true일때, 4점 이하 제외
				    
				    
				    for(Map<String, Object> item : list) {
				    	if(menu.equals(item.get("menu"))) {
				    		// skip 하는 조건이 체크 되어있고, 스킵 되어야 할 때 skip(continue)
				    		// 더블이 알고있는 상태에서 오브젝트 상태일때, 그럴때는 다운 캐스팅이 가능해진다.
				    		if(exclude && (double)item.get("point") <= 4.0) {
				    			continue;
				    		}
			%>
			    <tr>
			      <th><%= item.get("name")%></th>
			      <td><%= item.get("menu") %></td>
			       <td><%= item.get("point") %></td>
			    </tr>
			    
			<%		
				    	}
				}
			%>
		  	</tbody>
		</table>
</div>
	
</body>
</html>