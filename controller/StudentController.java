package com.dev.cgblrspringmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.cgblrspringmvc.beans.StudentInfo;
import com.dev.cgblrspringmvc.beans.StudentOtherInfo;
import com.dev.cgblrspringmvc.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;
	@GetMapping("/register")
	public String registerStudentForm(){
		return "form";
	}
	@PostMapping("/register")
public String registerStudent(StudentInfo info, StudentOtherInfo otherinfo) {
	return null;
    }
	@GetMapping("/login")
	public String loginPage() {
		return null;
	}
	@PostMapping("/login")
public String login(int id, String password) {
	return "home";
    }
	@GetMapping("/edit")
public String editStudentForm() {
	return null;
    }
	@PostMapping("/edit")
	public String editStudent(StudentInfo info, StudentOtherInfo otherinfo) {
		return null;
	}
public String deleteStudent() {
	return null;
}
}
