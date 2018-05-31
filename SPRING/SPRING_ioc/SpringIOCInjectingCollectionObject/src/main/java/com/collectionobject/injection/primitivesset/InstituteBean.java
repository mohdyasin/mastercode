package com.collectionobject.injection.primitivesset;

import java.util.List;
import java.util.Set;

public class InstituteBean {
	private String name;
	private Set<String> facultyNames;
	private Set<String> courseNames;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getFacultyNames() {
		return facultyNames;
	}

	public void setFacultyNames(Set<String> facultyNames) {
		this.facultyNames = facultyNames;
	}

	public Set<String> getCourseNames() {
		return courseNames;
	}

	public void setCourseNames(Set<String> courseNames) {
		this.courseNames = courseNames;
	}

	public void displayDetails() {

		System.out.println("Institute Name :: " + name);
		System.out.println("facultyNames :: ");
		for (String faculty : facultyNames) {
			System.out.println(faculty);
		}

		System.out.println("courseName :: ");
		for (String course : courseNames) {
			System.out.println(course);
		}
	}
}
