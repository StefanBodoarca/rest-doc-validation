package com.maven.rest.service.rest_doc_validation;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Test")
public class TestClass {	
	public TestClass() {
	}
	
	public String test() {
		return "test";
	}
}
