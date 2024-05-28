package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz04")
public class Quiz04 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>리스트 출력</title></head><body><ul>");
		for(int i = 1; i<=30; i++) {
			out.println("<li>"+i+"번째 리스트 <br>");
		}
		out.println("</ul></body></html>");
	}
}
