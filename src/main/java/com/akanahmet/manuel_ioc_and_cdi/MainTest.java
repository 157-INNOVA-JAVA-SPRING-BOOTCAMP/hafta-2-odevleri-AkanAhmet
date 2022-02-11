package com.akanahmet.manuel_ioc_and_cdi;

public class MainTest {
	
	public static void main(String[] args) {
		DatabaseManager databaseManager = new DatabaseManager(new MSSQL());
		databaseManager.newDatabaseName();
		
	}
	
}
