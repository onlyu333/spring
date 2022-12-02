package com.human.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.dao.IF_springDAO;
import com.human.dao.springDAOImpl;
import com.human.vo.PageVO;
import com.human.vo.springVO;

@Service
public class springServicsImpl implements IF_springService {
	@Inject
	private IF_springDAO sdao;

	@Override
	public void insertOne(springVO svo) throws Exception {
		// TODO Auto-generated method stub
		sdao.insertOne(svo);
		String[] fname = svo.getFiles();
		if (fname != null) {
			for (int i = 0; i < fname.length; i++) {
				if (fname[i]!=null) {
					sdao.insertAttach(fname[i]);
				}
			}
		}
	}

	@Override
	public List<springVO> selectAll(PageVO pageVO) throws Exception {
		// TODO Auto-generated method stub
		return sdao.selectAll(pageVO);
	}

	@Override
	public int countBoard() throws Exception {
		// TODO Auto-generated method stub
		return sdao.countBoard();
	}

	@Override
	public springVO selectOne(String vno) throws Exception {
		// TODO Auto-generated method stub
		return sdao.selectOne(vno);
	}

	@Override
	public List<String> selectAttach(String vno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(vno+"서비스단");
		return sdao.selectAttach(vno);
	}

	@Override
	public void updateCnt(String vno) throws Exception {
		// TODO Auto-generated method stub
		sdao.updateCnt(vno);
	}

	@Override
	public void boardDel(String vno) throws Exception {
		// TODO Auto-generated method stub
		sdao.boardDel(vno);
	}

	@Override
	public void updateBoard(springVO svo) throws Exception {
		// TODO Auto-generated method stub
		sdao.updateBoard(svo);
	}

}
