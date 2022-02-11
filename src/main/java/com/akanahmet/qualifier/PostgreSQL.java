package com.akanahmet.qualifier;

@QualifierMultipleChoice
public class PostgreSQL implements IDatabaseName {
	
	@Override
	public String databaseName(String data) {
		return "Optional PostgreSQL";
	}
	
}