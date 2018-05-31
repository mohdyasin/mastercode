package propertiesinjection.example;

import java.util.Enumeration;
import java.util.Properties;

public class DataBaseProperties {

	private Properties dbProperties;

	public Properties getDbProperties() {
		return dbProperties;
	}

	public void setDbProperties(Properties dbProperties) {
		this.dbProperties = dbProperties;
	}

	public void displayDetails() {
		Enumeration enumeration = dbProperties.keys();
		while (enumeration.hasMoreElements()) {
			String id = (String) enumeration.nextElement();
			String name = dbProperties.getProperty(id);
			System.out.println(id + "--> " + name);
		}
	}
}
