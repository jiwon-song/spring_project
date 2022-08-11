package com.hanul.project;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ham.HamHomeworkVO;
import ham.HamService;
import ham.HomeworkDetailVO;
import hong.ClassListVO;
import hong.HongCheckinVO;
import hong.HongService;
import hong.HongStudentListVO;
import hong.TestDetailVO;
import hong.TestVO;

@Controller
public class HamController {
	
	@Autowired private HamService service;	
	@Autowired private HongService hongservice;	
	private String teacher_id = "t1";
	
	
	// 반별 과제 목록 가져오기
	@RequestMapping("homework_list.ha")
	public String homework_list(Model model, int class_id, String class_name, String dis) {
					
		// 사이드 메뉴에 붙일 클래스 목록
		List<ClassListVO> list = null;
		
		list = hongservice.class_list(teacher_id);
		model.addAttribute("list", list);
		model.addAttribute("dis", dis);

		// 클래스 이름 뜨게 하기
		model.addAttribute("class_id", class_id);	// 클래스 이름 가져오게 수정할 것
		model.addAttribute("class_name", class_name);	// 클래스 이름 가져오게 수정할 것
		model.addAttribute("teacher_id", teacher_id);
		
		// 과제 목록
		List<HamHomeworkVO> homework_list = null;
		homework_list = service.homework_list(class_id, teacher_id);
		
		model.addAttribute("homework_list", homework_list);
		
		//선택한 반 이름 뜨게 하기
		
		return "ham/homework_list";	
	}
	
	// 과제 추가하기 (vo에 저장되어 있는 class_id 사용)
	@RequestMapping("homework_insert.ha")
	public String homework_insert(HamHomeworkVO vo, String class_name) {
		
		//vo 에 저장되어 있으므로 사용하기만 하면 됨 			
		// 테스트 추가하는 메소드 
		service.homework_insert(vo);

		try {
			class_name = URLEncoder.encode(class_name, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return "redirect:homework_list.ha?class_id="+vo.getClass_id()+"&dis=2&class_name="+class_name;	
	}
	
	
	//과제 삭제하기 (vo 를 사용하지 않기 떄문에 test_id 따로 넣어줘서 사용)
	@RequestMapping("homework_delete.ha")
	public String homework_delete(int homework_id, int class_id, String class_name) {
			
		service.homework_delete(homework_id);
		
		try {
			class_name = URLEncoder.encode(class_name, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "redirect:homework_list.ha?class_id="+class_id+"&dis=2&class_name="+class_name;
	}
	
	//과제 수정할 수 있는 페이지 요청하기
	@RequestMapping("homework_modify.ha")
	public String homework_modify(Model model, int homework_id, int class_id, String class_name) {
		// 사이드 메뉴에 붙일 클래스 목록
		List<ClassListVO> list = null;
		list = hongservice.class_list(teacher_id);
		model.addAttribute("list", list);

		// 선택한 클래스의 이름이 뜨게 하기 위해서
		model.addAttribute("class_id", class_id);	// 클래스 이름 가져오게 수정할 것
		model.addAttribute("class_name", class_name);	// 클래스 이름 가져오게 수정할 것
		model.addAttribute("teacher_id", teacher_id);

		// 수정 선택한 테스트의 아이디를 가져옴
		model.addAttribute("homework_id", homework_id);	// 클래스 이름 가져오게 수정할 것

		// 과제 목록
		List<HamHomeworkVO> homework_list = null;
		homework_list = service.homework_list(class_id, teacher_id);
		
		model.addAttribute("homework_list", homework_list);
		return "ham/homework_modify";
		
	}
	

	// 과제 수정 요청 보내기
	@RequestMapping("homework_update.ha")
	public String homework_update(Model model, HamHomeworkVO vo, int class_id, int homework_id, String class_name, String homework_name, String homework_date) {
		
		// 사이드 메뉴에 붙일 클래스 목록
		List<ClassListVO> list = null;
		list = hongservice.class_list(teacher_id);
		model.addAttribute("list", list);	

		// 선택한 클래스의 이름이 뜨게 하기 위해서
		model.addAttribute("class_name", class_name);	// 클래스 이름 가져오게 수정할 것	
			
		service.homework_update(vo);
	
		return "redirect:homework_list.ha?class_id="+class_id;
	}
	

	// 테스트 상세 화면 불러오기 ////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping(value="homework_detail.ha",  produces="text/plain;charset=UTF-8")
	public String homework_detail(Model model, int homework_id, String homework_name, String class_name, int class_id) {
		
		// 사이드 메뉴에 붙일 클래스 목록
		List<ClassListVO> list = null;
		list = hongservice.class_list(teacher_id);
		model.addAttribute("list", list);	
		model.addAttribute("homework_id", homework_id);	

		
		model.addAttribute("homework_name", homework_name);	
		model.addAttribute("class_name", class_name);	
		model.addAttribute("teacher_id", teacher_id);	
		
		List<HomeworkDetailVO> homework_detail_list = null; 		
		
		homework_detail_list = service.homework_detail(homework_id);
		model.addAttribute("homework_detail_list", homework_detail_list);	
		System.out.println(homework_detail_list.size());
		
		// 테스트 목록 가져오기
		List<HamHomeworkVO> homework_list = null;
		homework_list = service.homework_list(class_id, teacher_id);
		
		model.addAttribute("homework_list", homework_list);
		
		
		
		return "ham/homework_detail";
	}
	// test_id 받아서 테스트명, 클래스명, 클래스 아이디 가져오기 , 한글 깨지는 현상 처리해줌
		@RequestMapping(value="homework_id.ha" ,  produces="text/plain;charset=UTF-8")
		public String test_id(Model model, int homework_id) {
			
			HamHomeworkVO vo = service.homework_id(homework_id);
			String homework_name = vo.getHomework_name();
			String class_name = vo.getClass_name();
			int class_id = vo.getClass_id();
			
			try {
				homework_name = URLEncoder.encode(homework_name, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

			try {
				class_name = URLEncoder.encode(class_name, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			
			return "redirect:homework_detail.ha?homework_id="+homework_id+"&homework_name="+homework_name+"&class_name="+class_name+"&class_id="+class_id;
		}
	
	
	
}
