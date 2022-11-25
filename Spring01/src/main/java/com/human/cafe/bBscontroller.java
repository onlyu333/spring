package com.human.cafe;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.vo.BoardVO;

@Controller
public class bBscontroller {
	@RequestMapping(value = "/viewForm", method = RequestMethod.GET)
	public String test1(Locale locale, Model model) {
		//model.addAttribute("sss", name );
		
		return "wrForm";
	}
	@RequestMapping(value = "/wrAction", method = RequestMethod.POST)
	public String wrAction(Locale locale, Model model,BoardVO bvo) {
		//model.addAttribute("sss", name );
		//객체로 받을 때는 파라미터 이름과 객체의 변수의 이름이 일치하고 getter,setter가 있어야한다. > 자동맵핑
		System.out.println(bvo.getName());
		System.out.println(bvo.getEmail());
		return "wrForm";
	}
}
