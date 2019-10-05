package com.dev.cgblrspringmvc.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dev.cgblrspringmvc.beans.StudentInfo;
import com.dev.cgblrspringmvc.beans.StudentOtherInfo;

@Controller
@RequestMapping(path="/hello")
public class HelloWorldController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format= new SimpleDateFormat("dd-mm-yyyy");
		CustomDateEditor editor=new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}
	@RequestMapping(path="/query", method=RequestMethod.GET)
	public String query(@RequestParam("name") String name,@RequestParam("age") int age,ModelMap map) {
		map.addAttribute("name", name);
		map.addAttribute("age", age);
		return "index";
	}
	
	@RequestMapping(path="/path/{name}/{age}", method=RequestMethod.GET)
	public String path(@PathVariable("name") String name,@RequestParam("age") int age,ModelMap map) {
		map.addAttribute("name", name);
		map.addAttribute("age", age);
		return "index";
	
}
	
	@RequestMapping(path="/form", method=RequestMethod.GET)
	public String formpage() {
		return "form";
	}
	@RequestMapping(path="/form", method=RequestMethod.POST)
	public String form(StudentInfo info, StudentOtherInfo otherinfo,ModelMap map) {
		map.addAttribute("id", info.getId());
		map.addAttribute("name", info.getName());
		map.addAttribute("age", info.getAge());
		map.addAttribute("dob", info.getDob());
		map.addAttribute("email", otherinfo.getEmail());
		map.addAttribute("password", otherinfo.getPassword());
		return "formdate";
	}

	

@GetMapping(path="/addcookie")
public String addCookie(HttpServletResponse response, ModelMap map) {
	Cookie cookie = new Cookie("name", "Brad Pitt");
	response.addCookie(cookie);
	map.addAttribute("msg", "Cookie added to the browser");
	return "cookie";
}
@GetMapping(path="/getcookie")
public String getCookie(@CookieValue(name="name", required=false) String cookie, ModelMap map) {
	if(cookie==null) {
		map.addAttribute("msg", "Cookie doesnot exist");
	}else {
		map.addAttribute("msg", cookie);
	}
return cookie;
}
}