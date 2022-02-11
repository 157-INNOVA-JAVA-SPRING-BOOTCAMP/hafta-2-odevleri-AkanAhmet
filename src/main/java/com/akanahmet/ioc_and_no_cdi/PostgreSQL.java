package com.akanahmet.ioc_and_no_cdi;

public class PostgreSQL implements DatabaseName {
	
	@Override
	public void databaseName() {
		System.out.println("PostgreSQL ");
		
	}
}
