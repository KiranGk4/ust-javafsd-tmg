package com.ust;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

// Write a simple program which contains log4j methods. Try to implement log4j framework

public class SBA6 {
	
	static Logger log = Logger.getLogger(SBA6.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("Print info");
		log.debug("Debug message");
		log.trace("trace message");
		log.warn("Warning message");
		log.error("Error message");
		log.fatal("fatal message");

	}

}
