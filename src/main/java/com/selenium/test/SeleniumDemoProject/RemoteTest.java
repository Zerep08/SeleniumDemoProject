package com.selenium.test.SeleniumDemoProject;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class RemoteTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		//Properties of the remote machine
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		//Create the remote webdriver
		WebDriver driver = new RemoteWebDriver(new java.net.URL(" http://10.101.170.147:4444/wd/hub"),dc);
		
		driver.get("http:\\google.com.mx");
		driver.findElement(By.id("lst-ib")).sendKeys("hamsters bonitos");
		driver.findElement(By.id("lst-ib")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
	
	
	}

}
