package com.collectionobject.injection.objectset;

import java.util.List;

public class College {

	private String name;
	private List<Student> students;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public void displayDetails() {

		System.out.println("Name :: " + name);
		for(Student s: students){
			System.out.println(s.getSno());
			System.out.println(s.getName());
			System.out.println(s.getFee());
		}
	}
	
	
}
