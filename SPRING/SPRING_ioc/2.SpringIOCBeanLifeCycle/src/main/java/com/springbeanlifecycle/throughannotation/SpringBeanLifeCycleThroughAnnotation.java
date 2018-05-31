package com.springbeanlifecycle.throughannotation;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class SpringBeanLifeCycleThroughAnnotation {

	@PostConstruct
	public void initialize() {
		System.out.println("After bean initialization");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Cleaning up");
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
