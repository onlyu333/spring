package com.human.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.human.vo.PageVO;
import com.human.vo.springVO;

@Repository
public class springDAOImpl implements IF_springDAO {
// springdml dao 와 mybatis의 sqlsession 객체 필요
	private static String mapperQuery = "com.human.dao.IF_springDAO";
	
	//mybatis의 sqlsession 객체 필요
	@Inject //컨테이너에서 가져와야 한다. 컨테이너에서 자료형과 맞는 개체의 주소를 주입해 준다.
	private SqlSession sqlSession;//Sqlsession 타입의 객체는 스프링 컨테이너에 있다.
	
	@Override
	public void insertOne(springVO svo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(mapperQuery+".insertOne",svo);
	}

	@Override
	public List<springVO> selectAll(PageVO pageVO) throws Exception {
		// TODO Auto-generated method stub
		
		return sqlSession.selectList(mapperQuery+".selectAll",pageVO);
	}

	@Override
	public int countBoard() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperQuery+".countBoard");
	}

	@Override
	public void insertAttach(String filename) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(mapperQuery+".board_attach",filename);
	}

	@Override
	public springVO selectOne(String vno) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperQuery+".selectOne",vno);
	}

	@Override
	public List<String> selectAttach(String vno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(vno+"DAO단");
		return sqlSession.selectList(mapperQuery+".selectAttach",vno);
	}

	@Override
	   public void updateCnt(String vno) throws Exception {
	      sqlSession.update(mapperQuery+".cntplus",vno);
	      
	   }

	   @Override
	   public void boardDel(String vno) throws Exception {
	      // TODO Auto-generated method stub
	      sqlSession.delete(mapperQuery+".boardDel",vno);
	   }

	@Override
	public void updateBoard(springVO svo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(mapperQuery+".boardUpdate",svo);
	}
	
}
