package com.akanahmet.manuel_ioc_and_cdi;

public class MSSQL implements DatabaseName {
	
	@Override
	public void databaseName() {
		System.out.println("MSSQL ");
		
	}
}
