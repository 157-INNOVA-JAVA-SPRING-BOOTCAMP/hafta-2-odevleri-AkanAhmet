package com.akanahmet.no_ioc_no_cdi;

public class DatabaseNames {
	
	public void databaseName(String version) {
		
		if (version.equals("MySQL")) {
			System.out.println("MySQL");
		} else if (version.equals("PostgreSQL")) {
			System.out.println("PostgreSQL");
		} else if (version.equals("MariaDB")) {
			System.out.println("MariaDB");
		} else {
			System.out.println("You entered different Database name.");
		}
		
	}
	
}
