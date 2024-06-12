package com.test.lesson03;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson03/quiz02_delete")
public class DeleteQuiz02 extends HttpServlet{
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		int id = Integer.parseInt((request.getParameter("id")));
		
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		// delete query 수행
		String InsertQuery = "delete from `bookmark` where `id` = " + id;
		try {
			ms.update(InsertQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// db 연결 해제
		ms.disconnect();
		
		// 목록 이동
		response.sendRedirect("/lesson03/quiz02.jsp");
	}
}
