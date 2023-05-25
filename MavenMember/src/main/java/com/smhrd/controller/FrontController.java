package com.smhrd.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//~.do 요청을 모두 받아줄 것임
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Map<String, Command> list = null;
	
	public void init(ServletConfig config) throws ServletException {
		list = new HashMap<>();
		
		list.put("/join.do", new JoinController());
		list.put("/login.do", new LoginController());
		
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String key = request.getServletPath();
		
		Command temp  = list.get(key);
		String uri = temp.process(request, response);
		
		if(uri == "joinSuccess.jsp") {
			RequestDispatcher rd = request.getRequestDispatcher("joinSuccess.jsp");
			rd.forward(request, response);
		}else {
			response.sendRedirect(uri);
		}
	}

}
