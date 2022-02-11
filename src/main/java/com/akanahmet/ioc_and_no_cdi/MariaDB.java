package com.akanahmet.ioc_and_no_cdi;

public class MariaDB implements DatabaseName {
	
	@Override
	public void databaseName() {
		System.out.println("MariaDB");
		
	}
}
