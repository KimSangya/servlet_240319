
package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingEx01 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws IOException {
		
		// 한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain"); // plain : 순수한 글자라는 의미
		
		PrintWriter out = response.getWriter();
		out.println("안녕하세요.");
		
		// 날짜
		Date now = new Date();
		out.println(now);
		
		// formatter
	}
}
