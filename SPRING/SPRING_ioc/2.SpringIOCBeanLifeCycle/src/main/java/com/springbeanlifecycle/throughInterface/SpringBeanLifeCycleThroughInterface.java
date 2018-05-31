package com.springbeanlifecycle.throughInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringBeanLifeCycleThroughInterface implements InitializingBean, DisposableBean {

	/* Below Method is belongs to InitializingBean */
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

	/* Below Method is belongs to DisposableBean */
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
