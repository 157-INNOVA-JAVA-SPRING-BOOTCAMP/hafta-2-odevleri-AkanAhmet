package com.akanahmet.enumqualifier;

@EQualifier(EDatabaseName.MySQL)
public class MySQL implements IDatabaseName {
	
	@Override
	public String databaseName(String data) {
		return "Optionoyel name is MySQL";
	}
	
}
