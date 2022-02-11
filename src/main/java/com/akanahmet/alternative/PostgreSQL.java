package com.akanahmet.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class PostgreSQL implements IDatabaseName {
	
	@Override
	public String databaseName(String data) {
		return "DB name is PostgreSQL";
	}
	
}
