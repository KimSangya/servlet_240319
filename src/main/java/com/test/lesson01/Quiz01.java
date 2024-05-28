package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Quiz01 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest requset,
			HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String day = sdf.format(now);
		out.println("오늘의 날짜는 " + day +"입니다.");
	}
}
