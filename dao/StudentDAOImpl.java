package com.dev.cgblrspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import com.dev.cgblrspringmvc.beans.StudentInfo;
import com.dev.cgblrspringmvc.beans.StudentOtherInfo;

@Repository
public class StudentDAOImpl implements StudentDAO{

	@PersistenceUnit
	private LocalEntityManagerFactoryBean emf;
	@Override
	public boolean registerStudent(StudentInfo info, StudentOtherInfo otherinfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StudentInfo auth(int id, String password) {
		return null;
	}

	@Override
	public boolean editStudent(StudentInfo info, StudentOtherInfo otherinfo) {
       
       
		return false;
	}

	@Override
	public boolean deleteStudent(StudentInfo info) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
