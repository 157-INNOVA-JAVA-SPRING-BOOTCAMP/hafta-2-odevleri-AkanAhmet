package com.akanahmet.manuel_ioc_and_cdi;

public interface DatabaseName {
	
	public void databaseName();
	
	default void Deneme() {
		System.out.println("Merhabalar");
	}
	
}
