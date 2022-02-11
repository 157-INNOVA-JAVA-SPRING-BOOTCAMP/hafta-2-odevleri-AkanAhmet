package com.akanahmet.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeCDI")
@ApplicationScoped
public class ManagerJava {
	
	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	private IDatabaseName iDatabaseName;
	
	public String getiDatabaseName() {
		return iDatabaseName.databaseName("Names: ");
	}
	
}
