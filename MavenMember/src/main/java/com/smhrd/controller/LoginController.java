package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.WebMember;
import com.smhrd.model.WebMemberDAO;

public class LoginController implements Command {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String uri = "index.jsp";
		try {
			request.setCharacterEncoding("UTF-8");
			
			String email = request.getParameter("email");
			String pw = request.getParameter("pw");
			
			WebMember member = new WebMember(email, pw);
			
			System.out.println(member);
			
			WebMemberDAO dao = new WebMemberDAO();
			
			WebMember mem = dao.login(member);
			
			System.out.println(mem);
			
			if(mem.getEmail().equals(email) && mem.getPw().equals(pw)) {
				uri = "index.jsp";
				HttpSession session = request.getSession();
				session.setAttribute("mem", mem);
			}
			return uri;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return uri;
	}

}
