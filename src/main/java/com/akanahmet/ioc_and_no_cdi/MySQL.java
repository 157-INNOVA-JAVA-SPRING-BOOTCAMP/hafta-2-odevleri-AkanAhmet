package com.akanahmet.ioc_and_no_cdi;

public class MySQL implements DatabaseName {
	
	@Override
	public void databaseName() {
		System.out.println("MySQL ");
	}
	
}
