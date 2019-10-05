package com.dev.cgblrspringmvc.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student info")
public class StudentInfo {
	@Id
	@Column
private int id;
	@Column
private String name;
@Column
private int age;
@Column
private Date dob;
@OneToOne(cascade = CascadeType.ALL, mappedBy="info")

public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
