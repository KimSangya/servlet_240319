package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz10")
public class Quiz10 extends HttpServlet{
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		String realId = userMap.get("id");
		String realPassword = userMap.get("password");
		String realName = userMap.get("name");
		
		out.print("<html><head><title>입사 지원서</title></head><body>");
		if(realId.equals(id) == false) {
			out.print("아이디가 일치하지 않습니다.");
		} else if (realPassword.equals(password) == false){
			out.print("비밀번호가 일치하지 않습니다.");
		} else {
			out.print(realName+ "님 환영합니다!");
		}
		out.print("</body></html>");
	}
	
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "marobiana");
	        put("password", "qwerty1234");
	        put("name", "신보람");
	    }
	};
}


