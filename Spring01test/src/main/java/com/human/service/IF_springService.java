package com.human.service;


import java.util.List;

import com.human.vo.springVO;

public interface IF_springService { // 컨트롤러에서 호출할 메서드
 public void insertOne(springVO svo) throws Exception;
 public List<springVO> selectAll() throws Exception;
 // 정의된 메서드는 컨트롤러가 호출하는 메서드 이다 구현은 dao를 호출하는 메서드가 있을 것이다
 // 이름을 동일하게 쓰는 이유는 가독성때문이다, 가독성도 상대적입니다 그래서 컨트롤러 <> 서비스 <> dao먼저 이해하고
 // 이 기반으로 가독성을 이해해야 가독성이 좋다는 걸 이해할 수있다.
}
