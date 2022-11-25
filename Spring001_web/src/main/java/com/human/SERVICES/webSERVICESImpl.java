package com.human.SERVICES;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.DAO.IF_webDAO;
import com.human.VO.webVO;
@Service
public class webSERVICESImpl implements IF_webSERVICES {

	   @Inject
		private IF_webDAO wdao;
		@Override
		public void insertOne(webVO wvo) throws Exception {
			// TODO Auto-generated method stub
			wdao.insertOne(wvo);
		}

}
