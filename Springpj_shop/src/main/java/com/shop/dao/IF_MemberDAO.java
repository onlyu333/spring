package com.shop.dao;

import com.shop.vo.MemberVO;

public interface IF_MemberDAO {
   
   public void insertOne(MemberVO mvo) throws Exception;
   public int idCheck(String mid) throws Exception;
}