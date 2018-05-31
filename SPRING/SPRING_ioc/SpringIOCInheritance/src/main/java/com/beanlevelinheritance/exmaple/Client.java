package com.beanlevelinheritance.exmaple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"BeanLevelInheritance.xml");
		Child obj = (Child) context.getBean("child");
		System.out.println(obj);
	}
}
