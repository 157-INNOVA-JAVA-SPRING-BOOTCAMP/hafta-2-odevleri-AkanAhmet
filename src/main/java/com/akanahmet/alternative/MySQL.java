package com.akanahmet.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class MySQL implements IDatabaseName {
	
	@Override
	public String databaseName(String data) {
		return "DB name is MySQL";
	}
	
}
