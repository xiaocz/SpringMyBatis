package com.bocom.test;

import org.apache.log4j.Logger;

public class Main {
	
	protected Logger logger = Logger.getLogger(this.getClass());
	public Main(){
		logger.debug("Test Logger ...");
	}
	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main.logger);
	}
}
