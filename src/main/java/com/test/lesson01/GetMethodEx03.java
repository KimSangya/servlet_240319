package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex03")
public class GetMethodEx03 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, // get 요청으로 받아내겠다라는 의미
			HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json");
		
		// request parameter
		String userId = request.getParameter("user_id");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age")); 
		// 이런식으로 하면 String 값으로 가져옴으로, parseInt, valueOf로 변경해서 사용해준다.
		
		PrintWriter out = response.getWriter();
//		out.println("servlet 수행");
//		out.println("userId : " + userId);
//		out.println("name : " + name);
//		out.println("age : " + age);
		
		// {"user_id" : "rjdgh456", "name ": "김건호", "age" : 20 }
		out.print("{\"user_id\":\"" + userId + "\", \"name\": \""
				+ name + "\", \"age\":" + age + "}");
		
	}
}
