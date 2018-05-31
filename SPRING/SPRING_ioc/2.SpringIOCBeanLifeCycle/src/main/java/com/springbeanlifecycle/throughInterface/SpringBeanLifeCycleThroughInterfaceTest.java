package com.springbeanlifecycle.throughInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLifeCycleThroughInterfaceTest {
	public static void main(String[] args) {
		System.gc();
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeanLifeCycleThroughInterface.xml");
		/*If you will uncomment the line then only it will call the destroy method*/
		((AbstractApplicationContext)context).registerShutdownHook();
		SpringBeanLifeCycleThroughInterface obj = (SpringBeanLifeCycleThroughInterface) context.getBean("one");
		System.out.println(obj.getName());
	}
}
