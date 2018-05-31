package com.myspringioc;

public class MySqlConnectionProvider implements Connection {

	public String getConnection() {
		return "this is mysql connection";
	}

}
