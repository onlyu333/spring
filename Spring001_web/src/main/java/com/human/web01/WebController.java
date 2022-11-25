package com.human.web01;


import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.SERVICES.IF_webSERVICES;
import com.human.VO.webVO;

@Controller
public class WebController {
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		//model.addAttribute("sss", name );
		
		return "bbs/main";
	}
	@Inject
	private IF_webSERVICES wsvr;
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(Locale locale, Model model) throws Exception {
	
		return "bbs/join";
	}
	@RequestMapping(value = "/joinAction", method = RequestMethod.POST)
	public String wrAction(Locale locale, Model model, webVO wvo) throws Exception {
		System.out.println(wvo.getName());
		wsvr.insertOne(wvo);
		model.addAttribute("wvo",wvo);
		return "bbs/main";
	}
}
