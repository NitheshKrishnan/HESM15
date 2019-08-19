package edu.jspiders.studentmvcproject.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.jspiders.studentmvcproject.dto.StudentDTO;
import edu.jspiders.studentmvcproject.service.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	private StudentService service;
	
	@RequestMapping("/")
	public String getHomePage()
	{
		return "index";
	}
	
	@RequestMapping("/register")
	public String getRegisterPage()
	{
		return "register";
	}
	
	@RequestMapping("/signup")
	public String SignUp(HttpServletRequest req)
	{
		StudentDTO dto = new StudentDTO();
		
		dto.setStudentId(Integer.parseInt((req.getParameter("studentId"))));
		dto.setUsername(req.getParameter("username"));
		
		System.out.println(dto);
		
		return null;
	}
}