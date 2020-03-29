package com.maven.rest.service.rest_doc_validation;

public class App {
	private static String bindingIP;
	private static String bindingPort;
	private static Server server = null;
    
	public static void main( String[] args ) {
    	try {
    		initIpAndPort(args);
    		server = new Server();
    		server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
	private static void initIpAndPort(String[] args) {
		bindingIP = args[0];
		bindingPort = args[1];
	}
	
	public static String getBindingIp() {
		return bindingIP;
	}
	
	public static String getBindingPort() {
		return bindingPort;
	}
}