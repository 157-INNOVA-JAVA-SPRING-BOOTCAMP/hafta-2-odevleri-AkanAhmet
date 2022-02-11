package com.akanahmet.manuel_ioc_and_cdi;

public class MariaDB implements DatabaseName {
	
	@Override
	public void databaseName() {
		System.out.println("MariaDB ");
		
	}
}
