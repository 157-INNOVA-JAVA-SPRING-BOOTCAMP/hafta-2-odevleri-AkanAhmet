package com.akanahmet.ioc_and_no_cdi;

public class DatabaseNameManager {
	
	private DatabaseName databaseName;
	
	public DatabaseNameManager(DatabaseName databaseName) {
		this.databaseName = databaseName;
	}
	
	public void newDatabaseName() {
		databaseName.databaseName();
	}
	
}
