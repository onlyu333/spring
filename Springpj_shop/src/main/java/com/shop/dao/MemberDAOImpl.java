package com.shop.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shop.vo.MemberVO;
@Repository
public class MemberDAOImpl implements IF_MemberDAO{
   
   private static String mapperQuery= "com.shop.dao.IF_MemberDAO";
   
   
   @Inject
   private SqlSession sqlSession;

   @Override
   public void insertOne(MemberVO mvo) throws Exception {
      // TODO Auto-generated method stub
      sqlSession.insert(mapperQuery+".insertOne",mvo);
      
   }

@Override
public int idCheck(String mid) throws Exception{
	// TODO Auto-generated method stub
	return sqlSession.selectOne(mapperQuery+".idCheck",mid);
}
   

   
}