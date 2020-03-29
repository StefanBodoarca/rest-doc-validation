package com.maven.rest.service.rest_doc_validation;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

public class Server {
	
	private JAXRSServerFactoryBean sfb = null;
	private ServiceImpl serviceImpl = null;
	private final String REST_VALIDATION = "/rest/validation";
	
	public Server() throws Exception {
		sfb = new JAXRSServerFactoryBean();
		serviceImpl = new ServiceImpl();
		sfb.setServiceBean(serviceImpl.restValidationService());
		sfb.setResourceClasses(TestService.class);
		sfb.setResourceProvider(TestService.class, new SingletonResourceProvider(new TestService()));
		sfb.setAddress("http://" + App.getBindingIp() + ":" + App.getBindingPort() + "/services" + REST_VALIDATION);
		sfb.setProvider(serviceImpl.jacksonJsonProvider());
		sfb.setProvider(serviceImpl.exceptionRestMapper());
	}
	
	public void start() {
		sfb.create();
		System.out.println("Server ready...");
		System.out.println("Listening on " + App.getBindingIp() + ":" + App.getBindingPort());
	}
}
