package com.test.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request,
			ServletResponse response, FilterChain chain) throws IOException, ServletException { // chain으로 해서 걸게 된다.
		
		// 필터를 통과할 때, 인코딩을 설정 하겠다.
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
		
		// response.setContentType();은 각각 마다 해줘야하기 때문에 따로 여기에 저장 할 수 없다.
	}
	
}
