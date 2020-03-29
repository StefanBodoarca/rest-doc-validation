package com.maven.rest.service.rest_doc_validation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/check-service")
@Produces("text/xml")
public class TestService {
	private TestClass test = null;
	
	public TestService() {
		test = new TestClass(); 
	}
	
	@GET
	@Path("/")
	public String getResult() {
		return test.test();
	}
}
