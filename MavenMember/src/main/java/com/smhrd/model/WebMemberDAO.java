package com.smhrd.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

public class WebMemberDAO {

	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSessionFactory();
	
	public int join(WebMember member) {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		int cnt = 0;
		try {
		//insert(실제 실행할 sql구문(xml), sql 실행할 때 넘겨줄 값(?))
		// 반환값 : sql 실행 성공 ( 삽입 성공 ) = 1 , 실패 = 0
		 cnt = sqlSession.insert("WebMemberDAO.insert",member);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close(); //자원 반환 
		}
		return cnt;
	}
	
	public WebMember login(WebMember member) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		WebMember mem = null;	
		try {
			mem = (WebMember)sqlSession.selectOne("WebMemberDAO.select", member);
		}catch(Exception e) {
			e.printStackTrace();
		}
		sqlSession.close();
		
		return mem;
	}
}
