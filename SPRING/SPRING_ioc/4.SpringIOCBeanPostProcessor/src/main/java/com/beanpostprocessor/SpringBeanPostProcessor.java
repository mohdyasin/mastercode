package com.beanpostprocessor;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class SpringBeanPostProcessor implements BeanPostProcessor{


	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("postProcessAfterInitialization :: " + arg0 + " :: " +  arg1);
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization :: " + arg0 + " :: " +  arg1);
		return arg0;
	}
}
