package com.beanconfigurationlevelinheritance.exmaple_usage_understanding;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"BeanConfigurationLevelInheritance_usage_understanding.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
		Employee emp2 = (Employee) context.getBean("emp2");
		System.out.println(emp2);
		Employee emp3 = (Employee) context.getBean("emp3");
		System.out.println(emp3);
	}
}
