package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz03")
public class Quiz03 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest requset, 
			HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String day = sdf.format(now);
		
		out.println("<html><head><title>마론달 뉴스</title></head><body>");
		out.println("<h1>[단독] 고양이가 야옹해</h1> <small>기사 입력 시간 : " + day + "</small> <hr> 끝");
		out.println("</body></html>");
		
	}
}
