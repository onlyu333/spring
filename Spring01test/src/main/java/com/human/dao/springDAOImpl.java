package com.human.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.human.vo.springVO;

@Repository
public class springDAOImpl implements IF_springDAO {
// springdml dao 와 mybatis의 sqlsession 객체 필요
	private static String mapperQuery = "com.human.dao.IF_springDAO";
	
	//mybatis의 sqlsession 객체 필요
	@Inject //컨테이너에서 가져와야 한다. 컨테이너에서 자료형과 맞는 개체의 주소를 주입해 준다.
	private SqlSession SqlSession;//Sqlsession 타입의 객체는 스프링 컨테이너에 있다.
	
	@Override
	public void insertOne(springVO svo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.insert(mapperQuery+".insertOne",svo);
	}

}
