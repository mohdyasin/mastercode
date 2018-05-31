package com.springbeannameaware;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class SpringBeanNameAware implements BeanNameAware, BeanFactoryAware, ApplicationContextAware{


	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBeanName(String arg0) {
		System.out.println("setBeanName :: " + arg0);
		
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("setBeanFactory :: " + arg0);
		
	}
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		System.out.println("setApplicationContext :: " + arg0);
		
	}
}
