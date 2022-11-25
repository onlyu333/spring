package com.human.dao;


import java.util.List;

import com.human.vo.springVO;

public interface IF_springDAO {
	public void insertOne(springVO svo) throws Exception;// 서비스단에서 호출할 메서드 매핑에 사용될 메서드
     public List<springVO> selectAll() throws Exception;
}
