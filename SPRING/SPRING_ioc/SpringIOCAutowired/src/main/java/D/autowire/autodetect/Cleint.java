package D.autowire.autodetect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Cleint {
	public static void main(String[] args) {
		System.out.println("Auto wiring (Autodetect).");
		//Run below with default constructor in (Servlet.java) it will call setter injection (byType).
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire/D_autodetect/autowireautodetect.xml");
		Servlet servlet = (Servlet) context.getBean("servletref");
		servlet.servletMethod();
		*/
		//Run below Uncomment default constructor in (Servlet.java) it will call constructor.
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire/D_autodetect/autowireautodetect.xml");
		Servlet servlet = (Servlet) context.getBean("servletref");
		servlet.servletMethod();
	}
}
