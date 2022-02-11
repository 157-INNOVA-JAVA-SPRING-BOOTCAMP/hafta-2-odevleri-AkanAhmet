package com.akanahmet.no_ioc_no_cdi;

public class MainTest {
	
	public static void main(String[] args) {
		
		DatabaseManager databaseManager = new DatabaseManager();
		databaseManager.newDatabaseName();
		
	}
	
}
