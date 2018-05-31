package myspringiocutilizer;

import com.myspringioc.Connection;

import myspringioc.container.MyContainer;

public class ConnectionUtilizer {
private static MyContainer container = new MyContainer();
	public static void main(String[] args) {
		Connection contract = (Connection)container.getBean("provider");
		String connectionString = contract.getConnection();
		System.out.println(connectionString);
	}
}
