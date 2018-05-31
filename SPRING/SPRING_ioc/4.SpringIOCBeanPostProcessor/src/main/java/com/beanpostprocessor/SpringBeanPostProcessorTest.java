package com.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanPostProcessorTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanPostProcessor.xml");
		((AbstractApplicationContext)context).registerShutdownHook();
		SpringBean obj = (SpringBean) context.getBean("one");
		System.out.println(obj.getName());
	}
}

