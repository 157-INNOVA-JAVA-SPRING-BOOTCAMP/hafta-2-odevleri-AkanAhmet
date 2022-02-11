package com.akanahmet.enumqualifier;

@EQualifier(EDatabaseName.PostgreSQL)
public class PostgreSQL implements IDatabaseName {
	
	@Override
	public String databaseName(String data) {
		return "Optionel name PostgreSQL";
	}
	
}
