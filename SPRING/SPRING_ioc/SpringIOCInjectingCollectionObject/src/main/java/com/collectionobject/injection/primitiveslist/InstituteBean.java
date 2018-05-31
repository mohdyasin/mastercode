package com.collectionobject.injection.primitiveslist;

import java.util.List;


public class InstituteBean {
	private String name;
	private List<String> facultyNames;
	private List<String> courseNames;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<String> getFacultyNames() {
		return facultyNames;
	}


	public void setFacultyNames(List<String> facultyNames) {
		this.facultyNames = facultyNames;
	}


	public List<String> getCourseNames() {
		return courseNames;
	}


	public void setCourseNames(List<String> courseNames) {
		this.courseNames = courseNames;
	}


	public void displayDetails(){
	
		System.out.println("Institute Name :: " + name);
		System.out.println("facultyNames :: ");
		for(String faculty : facultyNames){
			System.out.println(faculty);
		}
		
		System.out.println("courseName :: ");
		for(String course : courseNames){
			System.out.println(course);
		}
	}
}
