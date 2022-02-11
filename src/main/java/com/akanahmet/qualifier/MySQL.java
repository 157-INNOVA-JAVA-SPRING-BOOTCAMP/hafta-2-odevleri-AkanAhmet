package com.akanahmet.qualifier;

import javax.enterprise.inject.Default;

@Default
public class MySQL implements IDatabaseName {
	
	@Override
	public String databaseName(String data) {
		return "Default MySQL";
	}
	
}
