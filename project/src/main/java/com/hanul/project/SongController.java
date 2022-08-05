package com.hanul.project;

import java.util.List;
import java.util.Locale;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import song.ClassVO;
import song.SongHomeworkVO;
import song.SongService;
import song.StudentListVO;

@Controller
public class SongController {
	@Autowired private SongService service;
	
	//학생이름 클릭시 학생 상세정보화면 요청
	@RequestMapping("student_detail.so")
	public String stu_detail(Model model,  String dis, String class_name, String student_id) {
		
		List<ClassVO> list = service.class_list();
		 
		model.addAttribute("list", list);
		model.addAttribute("dis", dis);
				
		//학생리스트
		StudentListVO stu_de = service.stu_detail(student_id);
		
		model.addAttribute("class_name", class_name);
		model.addAttribute("stu_de", stu_de);
		
		
		//과제리스트
		SongHomeworkVO hw_de = service.stu_hw_detail(student_id);
		model.addAttribute("hw_de", hw_de);
		
		
		return "song/student_detail";
	}
	
	@RequestMapping("student_list.so")
	public String stu_list(Model model, int class_id, String dis, String class_name) {
		// 사이드 메뉴에 붙일 클래스 목록

		List<ClassVO> list = service.class_list();
		 
		model.addAttribute("list", list);
		model.addAttribute("dis", dis);
		
		//학생리스트
		List<StudentListVO> stu_list = null;
		stu_list = service.student_list(class_id);
		model.addAttribute("stu_list", stu_list);
		model.addAttribute("class_name", class_name);
		
		return "song/student_list";
	}
	
	//반목록 화면 요청
	@RequestMapping("class_list.so")
	public String list(Locale locale, Model model) {
		
		List<ClassVO> list = service.class_list();
		 
		model.addAttribute("list", list);
		
		
		return "song/class_list";
	}

}
