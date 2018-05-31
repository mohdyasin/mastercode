package com.springbeanlifecycle.throughannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLifeCycleThroughAnnotationTest {
	public static void main(String[] args) {
		System.gc();
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeanLifeCycleThroughXMLAnnotation.xml");
		((AbstractApplicationContext)context).registerShutdownHook();
		SpringBeanLifeCycleThroughAnnotation obj = (SpringBeanLifeCycleThroughAnnotation) context.getBean("one");
		System.out.println(obj.getName());
	}
}
