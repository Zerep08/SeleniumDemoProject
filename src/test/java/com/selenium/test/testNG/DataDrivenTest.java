package com.selenium.test.testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DataDrivenTest {
	
	
	@Test
	public void getProperties() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\1459751\\Documents\\workplace\\SeleniumDemoProject\\src\\test\\java\\com\\selenium\\test\\testNG\\data.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("saludo"));
	}

}
