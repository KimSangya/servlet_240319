package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex02") // 이 친구를 추가 해놓으면 Web.XML에서 적을 필요가 없다.
public class UrlMappingEx02 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		//한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		// 서블릿 : 자바 코드 있는 곳에서 html이 함께 들어갈 수 있는 곳 / 안 좋은 방법(안쓰는게 나음)
		// 1+2+..+10 합계
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>합계</title></head><body>");
		out.println("합계 : <b>" + sum + "<b>");
		out.println("</body></html>");
		
	}
}
