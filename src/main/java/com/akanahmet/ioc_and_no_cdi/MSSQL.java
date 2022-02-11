package com.akanahmet.ioc_and_no_cdi;

public class MSSQL implements DatabaseName {
	
	@Override
	public void databaseName() {
		System.out.println("MSSQL ");
		
	}
}
