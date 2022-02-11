package com.akanahmet.enumqualifier;

import javax.enterprise.inject.Default;

@Default
public class DefaultDatabaseName implements IDatabaseName {
	
	@Override
	public String databaseName(String data) {
		return "Default name MySQL";
	}
	
}
