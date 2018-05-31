package com.collectionobject.injection.objectlist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionobjectinjectionobjectlist.xml");
		College emp1 = (College) context.getBean("college");
		emp1.displayDetails();
	}
}
