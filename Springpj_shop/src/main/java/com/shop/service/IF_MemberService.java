package com.shop.service;

import com.shop.vo.MemberVO;

public interface IF_MemberService{
   public void insertOne(MemberVO mvo)throws Exception;
   public int idCheck(String mid) throws Exception;
}