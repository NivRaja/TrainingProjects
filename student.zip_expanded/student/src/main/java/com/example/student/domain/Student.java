package com.example.student.domain;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String studentname;
	private String studentcourse;
	private int studentfees;
	public Student() {
		
	}
	public Student(String studentname, String course, int studentfees, Long id) {
		
		this.studentname = studentname;
		this.studentcourse = course;
		this.studentfees = studentfees;
		this.id = id;
	}
	
	

	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCourse() {
		return studentcourse;
	}
	public void setCourse(String course) {
		this.studentcourse = course;
	}
	public int getStudentfees() {
		return studentfees;
	}
	public void setStudentfees(int studentfees) {
		this.studentfees = studentfees;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString(){
		return "Student[studentname="+studentname+",studentcourse="+studentcourse+",studentfees="+studentfees+",id="+id+"]";
				
	
}}
	
	
	
	
	
	
	
	
	
	


