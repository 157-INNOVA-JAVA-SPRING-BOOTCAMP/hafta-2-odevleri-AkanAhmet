package com.akanahmet.no_ioc_no_cdi;

public class DatabaseManager {
	
	public void newDatabaseName() {
		DatabaseNames databasename = new DatabaseNames();
		databasename.databaseName("MySQL");
	}
}
