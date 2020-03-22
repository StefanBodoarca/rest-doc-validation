package com.maven.rest.service.rest_doc_validation;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class App {
	
	public static final String REST_VALIDATION = "/rest/validation";
	private static ServiceImpl serviceImpl = null;
    
	public static void main( String[] args ) throws Exception {
    	JAXRSServerFactoryBean sfb = new JAXRSServerFactoryBean();
    	serviceImpl = new ServiceImpl();
		sfb.setServiceBean(serviceImpl.restValidationService());
		sfb.setAddress("http://localhost:" + args[0] + "/services" + REST_VALIDATION);
		sfb.setProvider(serviceImpl.jacksonJsonProvider());
		sfb.setProvider(serviceImpl.exceptionRestMapper());
		sfb.create();
    }
}