package com.human.test;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.service.IF_springService;
import com.human.vo.springVO;

@Controller
public class springT {
//	@RequestMapping(value = "/spring", method = RequestMethod.GET)
//	public String test1(Locale locale, Model model) {
//		return "spring";
//	}	
	@Inject
	private IF_springService ssrv;

	@RequestMapping(value = "/wrForm", method = RequestMethod.GET)
	public String test2(Locale locale, Model model) {
		// model.addAttribute("sss", name );

		return "bbs/wrForm";
	}

	@RequestMapping(value = "/wrAction", method = RequestMethod.POST)
	public String wrAction(Locale locale, Model model, springVO svo) throws Exception {
		System.out.println(svo.getName() + "----디버깅 용도");
		// model.addAttribute("sss", name );
		// 객체로 받을 때는 파라미터 이름과 객체의 변수의 이름이 일치하고 getter,setter가 있어야한다. > 자동맵핑
		ssrv.insertOne(svo);
		model.addAttribute("svo", svo);
		return "redirect:/bbsList";
	}

	@RequestMapping(value = "/bbsList", method = RequestMethod.GET)
	public String test3(Locale locale, Model model) throws Exception {
		// model.addAttribute("sss", name );
		List<springVO> list =ssrv.selectAll();
		System.out.println(list.size()+"건이 입력되었습니다");
		model.addAttribute("bList",list);
		return "bbs/bbsList";
	}
}
