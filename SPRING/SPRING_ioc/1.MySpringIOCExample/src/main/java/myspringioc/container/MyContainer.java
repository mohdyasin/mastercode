package myspringioc.container;

import java.util.Properties;

public class MyContainer {

	private static Properties properties;
	static{
		try{
			properties = new Properties();
			properties.load(MyContainer.class.getClassLoader().getResourceAsStream("myproperties.properties"));
		}catch(Exception e){
			System.out.println("Exception while loading the properties file");
		}
	}
	
	public static Object getBean(String providerKey){
		Object object = null;
		String providerClassName = properties.getProperty(providerKey);
		try{
			Class c = Class.forName(providerClassName);
			object = c.newInstance();
		}catch(Exception e){
			e.printStackTrace();
		}
		return object;
	}
}
