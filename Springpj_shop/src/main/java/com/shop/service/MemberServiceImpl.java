package com.shop.service;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.shop.dao.IF_MemberDAO;
import com.shop.dao.MemberDAOImpl;
import com.shop.vo.MemberVO;
@Service
public class MemberServiceImpl implements IF_MemberService{
   
   @Inject
   private IF_MemberDAO mdao;
   

   @Override
   public void insertOne(MemberVO mvo) throws Exception {
      // TODO Auto-generated method stub
      
      System.out.println(mvo.getMname()+"등록됨");
      mdao.insertOne(mvo);
      
   }


@Override
public int idCheck(String mid) throws Exception {
	// TODO Auto-generated method stub
	return mdao.idCheck(mid);
}



   

   

}
