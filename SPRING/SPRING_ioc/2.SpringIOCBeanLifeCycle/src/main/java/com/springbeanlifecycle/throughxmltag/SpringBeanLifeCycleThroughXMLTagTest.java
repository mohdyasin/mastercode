package com.springbeanlifecycle.throughxmltag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLifeCycleThroughXMLTagTest {
	public static void main(String[] args) {
		System.gc();
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeanLifeCycleThroughXMLTag.xml");
		((AbstractApplicationContext)context).registerShutdownHook();
		SpringBeanLifeCycleThroughXMLTag obj = (SpringBeanLifeCycleThroughXMLTag) context.getBean("one");
		System.out.println(obj.getName());
	}
}
