package com.test.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlService {
	private static MysqlService mysqlService = null;
	
	// 도메인뒤에 접속할 데이터 베이스명까지 써준다. <필수적>
	private static final String URL = "jdbc:mysql://localhost:3306/test_240319"; // 이친구는 절대로 바꾸지 않겠다라는 의미
	private static final String ID = "root";
	private static final String PASSWORD = "Kgh0103!";
	
	private Connection conn;
	private Statement stmt;
	private ResultSet res;
	
	// 객체 생성 메소드 / 디자인 패턴 : 팩토리 패턴, 싱글톤 패턴(진짜 중요)
	// Singleton 패턴 : mysqlService라는 객체가 단 하나만 생성될 수 있도록 하는 디자인 패턴
	// 이유 : DB연결을 여러 객체에서 하는걸 방지하기 위해서,
	
	public static MysqlService getInstance() { // static을 붙이는 이유는 new를 하지 않고 바로 부른 매소드를 부를수있기 떄문에.
		if(mysqlService == null) { // 하나만 만들어져있는 mysqlService를 따로 만들수없기 때문에.
			mysqlService = new MysqlService();
		}
		
		return mysqlService;
	}
	
	// DB 접속 - JDBC (DB에 커넥해주는 드라이버들을 올려주는 단계)
	public void connect() {
		try {
			// 1. driver memory에 loading
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			// 2. DB연결(connection)
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			
			// 3. statement (쿼리를 실행할 준비)
			stmt = conn.createStatement();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// DB 연결 해제
	public void disconnect() {
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// CRUD중에 R만 빼고 한다. R에 결과값이 담기고, 나머지는 리턴을 해주기 때문.
	// R - Read:select
	public ResultSet select(String query) throws SQLException {
		res = stmt.executeQuery(query);
		return res;
	}
	
	// CUD : insert, update, delete
	public void update(String query) throws SQLException {
		stmt.executeUpdate(query);
	}
	
}
