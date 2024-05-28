package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz08")
public class Quiz08 extends HttpServlet{
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		// response header set
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// request param
		String search = request.getParameter("search");
		
		// 리스트 정의
		List<String> list1 = new ArrayList<String>(Arrays.asList(
		        "강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요."));	
		String[] array = {};
		
		// 탐색 출력
		out.println("<html><head><title>검색 결과</title></head><body>");
//		선생님이 해주시는 방법
		Iterator<String> iter = list1.iterator();
		while(iter.hasNext()) {
			String line = iter.next();
			if(line.contains(search)) {
				line.replace(search, "<b>" + search +"</b>");
				out.print(line + "<br>");
			}
		}
		out.print("</body></html>");
	}
}
