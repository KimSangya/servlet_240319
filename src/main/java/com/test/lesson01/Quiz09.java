package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz09")
public class Quiz09 extends HttpServlet{
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String introduce = request.getParameter("introduce");
		
		
		out.print("<html><head><title>입사 지원서</title></head><body>");
		out.print("<b>"+ name + "</b>님의 지원이 완료 되었습니다. <br>");
		out.print("<h4>지원 내용</h4>");
		out.print(introduce);
		out.print("</body></html>");
		
	}
}
