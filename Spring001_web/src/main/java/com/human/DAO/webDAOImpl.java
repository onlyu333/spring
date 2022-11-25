package com.human.DAO;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.human.VO.webVO;
@Repository
public class webDAOImpl implements IF_webDAO {
	private static String mapperQuery = "com.human.DAO.IF_webDAO";
	@Inject 
	private SqlSession SqlSession;
	
	@Override
	public void insertOne(webVO wvo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.insert(mapperQuery+".insertOne",wvo);
	}

//	@Override
//	public List<webVO> selectAll() throws Exception {
//		// TODO Auto-generated method stub
//		
//		return SqlSession.selectList(mapperQuery+".selectAll");
//	}
}
