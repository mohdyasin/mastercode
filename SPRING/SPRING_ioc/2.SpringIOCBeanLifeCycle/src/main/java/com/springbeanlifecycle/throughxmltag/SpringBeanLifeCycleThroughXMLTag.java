package com.springbeanlifecycle.throughxmltag;


public class SpringBeanLifeCycleThroughXMLTag {

	/* Below Method is belongs to InitializingBean */
	public void inits() throws Exception {
		System.out.println("inits");
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
