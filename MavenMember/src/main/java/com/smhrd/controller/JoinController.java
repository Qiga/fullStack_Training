package com.smhrd.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.WebMember;
import com.smhrd.model.WebMemberDAO;

public class JoinController implements Command {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String uri =""; 
		
		try {
			request.setCharacterEncoding("UTF-8");
			
			String email = request.getParameter("email");
			String pw =  request.getParameter("pw");
			String tel =  request.getParameter("tel");
			String address = request.getParameter("address");
			
			WebMember member = new WebMember(email, pw, tel, address); 
			
			WebMemberDAO dao = new WebMemberDAO();
			
			int cnt = dao.join(member);
			if(cnt>0) {
				System.out.println("성공");
				uri = "joinSuccess.jsp";		
//				RequestDispatcher rd = request.getRequestDispatcher("joinSuccess.jsp");
//				rd.forward(request, response);
			}else {
				uri = "index.jsp";
			}
			
			
//			HttpSession session = request.getSession();
//			session.setAttribute("memberinfo", member);
			
		}catch(UnsupportedEncodingException e) {
			System.out.println("인코딩 오류");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return uri;
	}

}
