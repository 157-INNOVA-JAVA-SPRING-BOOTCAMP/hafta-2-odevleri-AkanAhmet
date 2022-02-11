package com.akanahmet.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("qualiferCDI")
@ApplicationScoped
public class QualiferManager implements Serializable {
	private static final long serialVersionUID = 3097860167944776376L;
	
	@Inject
	@QualifierMultipleChoice
	private IDatabaseName iDatabaseName;
	
	public String getiDatabaseName() {
		return iDatabaseName.databaseName(" Name ");
	}
	
}
