package com.akanahmet.enumqualifier;

@EQualifier(EDatabaseName.MSSQL)
public class MSSQL implements IDatabaseName {
	
	@Override
	public String databaseName(String data) {
		return "Optionel name MSSQL";
	}
	
}
