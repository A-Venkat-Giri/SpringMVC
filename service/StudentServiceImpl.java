package com.dev.cgblrspringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.cgblrspringmvc.beans.StudentInfo;
import com.dev.cgblrspringmvc.beans.StudentOtherInfo;
import com.dev.cgblrspringmvc.dao.StudentDAO;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDAO dao;

	@Override
	public boolean registerStudent(StudentInfo info, StudentOtherInfo otherinfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StudentInfo auth(int id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean editStudent(StudentInfo info, StudentOtherInfo otherinfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(StudentInfo info) {
		// TODO Auto-generated method stub
		return false;
	}

}
