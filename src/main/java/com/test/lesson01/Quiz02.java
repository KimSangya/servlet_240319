package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Quiz02 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest requset, 
			HttpServletResponse response) throws IOException {
		// 한글 깨짐 방지 - response header
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH시 mm분 ss초");
		String time = sdf.format(now);
		
		out.println("현재 시간은 " + time + "입니다.");
	}
}
