package com.akanahmet.manuel_ioc_and_cdi;

import javax.inject.Inject;

public class DatabaseManager {
	
	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	private DatabaseName databaseName;
	
	public DatabaseManager(DatabaseName databaseName) {
		this.databaseName = databaseName;
	}
	
	public void newDatabaseName() {
		databaseName.databaseName();
	}
	
}
