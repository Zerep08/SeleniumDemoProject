package com.selenium.test.SeleniumDemoProject;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test {

	public static void main(String[] args) {

    	Result rest = JUnitCore.runClasses(TestSuite.class);
    	
    	for(Failure fail : rest.getFailures()) {
    		System.out.println(fail.toString());
    	}
    	
    	System.out.println(rest.wasSuccessful());
		
		
	}

}
