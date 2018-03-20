package com.selenium.test.SeleniumDemoProject;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class DemoLog4j {

	// Create the log object
	private static Logger log = LogManager.getLogger(DemoLog4j.class.getName());
	public static void main(String[] args) {
		//BasicConfigurator.configure();
		
		log.info("Hola");
		log.error("Valio madres esto");
		log.fatal("Ya nos cargo el payaso");

	}

}
