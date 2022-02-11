package com.akanahmet.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped
public class QualifierManager {
	
	@Inject
	@EQualifier(EDatabaseName.MSSQL)
	IDatabaseName iDatabaseName;
	
	public String getiDatabaseName() {
		return iDatabaseName.databaseName("Choice");
	}
	
}
