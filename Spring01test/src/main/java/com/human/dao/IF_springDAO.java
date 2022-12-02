package com.human.dao;


import java.util.List;

import com.human.vo.PageVO;
import com.human.vo.springVO;

public interface IF_springDAO {
	public void insertOne(springVO svo) throws Exception;// 서비스단에서 호출할 메서드 매핑에 사용될 메서드
     public List<springVO> selectAll(PageVO pageVO) throws Exception;
     public int countBoard() throws Exception;
     public void insertAttach(String filename) throws Exception;
     public springVO selectOne(String vno);
     public List<String> selectAttach(String vno) throws Exception;
     public void updateCnt(String vno) throws Exception;
     public void boardDel(String vno) throws Exception;
     public void updateBoard(springVO svo) throws Exception;
}