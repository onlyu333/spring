package com.human.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.dao.IF_springDAO;
import com.human.vo.springVO;
@Service
public class springServicsImpl implements IF_springService{
    @Inject
	private IF_springDAO sdao;
	@Override
	public void insertOne(springVO svo) throws Exception {
		// TODO Auto-generated method stub
		sdao.insertOne(svo);
	}

}
