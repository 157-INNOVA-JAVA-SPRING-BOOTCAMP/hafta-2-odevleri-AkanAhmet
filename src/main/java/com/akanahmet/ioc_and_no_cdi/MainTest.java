package com.akanahmet.ioc_and_no_cdi;

public class MainTest {
	
	public static void main(String[] args) {
		DatabaseNameManager databaseNameManager = new DatabaseNameManager(new MSSQL());
		databaseNameManager.newDatabaseName();
		
	}
	
}
