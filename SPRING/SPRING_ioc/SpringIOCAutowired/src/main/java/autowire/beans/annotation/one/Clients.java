package autowire.beans.annotation.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Clients {

	public static void main( String[] args )
    {
    	ApplicationContext context =
    	  new ClassPathXmlApplicationContext("autowire/annotationone/annotationone.xml");
    	/*
    	Customer cust = (Customer)context.getBean();
    	System.out.println(cust);
    	*/
    }
}
