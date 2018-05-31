package com.springbeannameaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanNameAwareTest {
	public static void main(String[] args) {
		System.gc();
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeanNameAware.xml");
		SpringBeanNameAware obj = (SpringBeanNameAware) context.getBean("one");
		System.out.println(obj.getName());
	}
}
