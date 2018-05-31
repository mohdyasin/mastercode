package com.collectionobject.injection.primitiveslist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionobjectinjectionprimitivelist.xml");
		InstituteBean emp1 = (InstituteBean) context.getBean("ibref");
		emp1.displayDetails();
	}
}
