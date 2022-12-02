package com.human.test;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.human.service.IF_springService;
import com.human.util.FileDataUtil;
import com.human.vo.PageVO;
import com.human.vo.springVO;

@Controller
public class springT {
//	@RequestMapping(value = "/spring", method = RequestMethod.GET)
//	public String test1(Locale locale, Model model) {
//		return "spring";
//	}	
	@Inject
	private IF_springService ssrv;
	@Inject
	private FileDataUtil FileDataUtil;

	@RequestMapping(value = "/wrForm", method = RequestMethod.GET)
	public String test2(Locale locale, Model model) {
		// model.addAttribute("sss", name );

		return "bbs/wrForm";
	}

	@RequestMapping(value = "/wrAction", method = RequestMethod.POST)
	public String wrAction(Locale locale, Model model, springVO svo, MultipartFile[] file) throws Exception {
		// System.out.println(svo.getName() + "----디버깅 용도");
		// model.addAttribute("sss", name );
		// 객체로 받을 때는 파라미터 이름과 객체의 변수의 이름이 일치하고 getter,setter가 있어야한다. > 자동맵핑
		// System.out.println(file.getOriginalFilename()+"첨부파일");
		// 객체의 메서드 호출 매개변수로 file을 넘긴다.<지정한 폴더로 첨부파일복사>

		String[] fileNames = FileDataUtil.fileUpload(file);
		svo.setFiles(fileNames);
		// System.out.println(fileNames+ "디비에 저장된 파일명");
		// model.addAttribute("svo", svo);
		ssrv.insertOne(svo);
		return "redirect:/bbsList";
	}

	@RequestMapping(value = "/bbsList", method = RequestMethod.GET)
	public String test3(Locale locale, Model model, @ModelAttribute("pageVO") PageVO pageVO) throws Exception {
		// model.addAttribute("sss", name );
		if (pageVO.getPage() == null) {// 클라이언트가 페이지 정보를 넘겨주지 않는다면 기본값 1로 셋팅
			pageVO.setPage(1);
		}
		System.out.println("현재 페이지" + pageVO.getPage());
		int totalpageCnt = ssrv.countBoard(); // select count(*) from board2;
		pageVO.setTotalCount(totalpageCnt);
		List<springVO> list = ssrv.selectAll(pageVO);
		System.out.println(list.size() + "건이 입력되었습니다");
		model.addAttribute("bList", list);
		model.addAttribute("pageVO", pageVO);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}

		return "bbs/bbsList";
	}

	@RequestMapping(value = "/bbsView", method = RequestMethod.GET)
	public String BbsView(Locale locale, Model model, @RequestParam("vno") String vno) throws Exception {
		// model.addAttribute("sss", name );
		ssrv.updateCnt(vno);
		springVO tempvo = ssrv.selectOne(vno);
		System.out.println(vno);
		List<String> attachList = ssrv.selectAttach(vno);
		model.addAttribute("vno", tempvo);
		model.addAttribute("attachList", attachList);
		return "bbs/bbsView";
	}

	@RequestMapping(value = "/bbsDel", method = RequestMethod.GET)
	public String BbsDel(Locale locale, Model model, @RequestParam("vno") String vno) throws Exception {
           ssrv.boardDel(vno);
		return "redirect:/bbsList";
	}
	@RequestMapping(value = "/bbsMod", method = RequestMethod.GET)
	public String BbsMod(Locale locale, Model model, @RequestParam("vno") String vno) throws Exception {
           springVO tempvo =ssrv.selectOne(vno);
           model.addAttribute("springVO",tempvo);
		return "bbs/bbsmod";
	}
	@RequestMapping(value = "/bbsModAction", method = RequestMethod.POST)
	public String bbsModAction(Locale locale, Model model, springVO svo, MultipartFile[] file) throws Exception {
		System.out.println(svo.getNum());
		System.out.println(svo.getEmail());
		System.out.println(svo.getPass());
		System.out.println(svo.getName());
		System.out.println(svo.getTitle());
		ssrv.updateBoard(svo);
		return "redirect:/bbsView?vno="+svo.getNum();
	}
}
