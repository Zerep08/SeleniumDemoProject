package com.selenium.test.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser2Test {

	public String baseUrl = "https://auth.ultimatix.net/utxLogin";
	String driverPath = "C:\\Users\\1459751\\Documents\\Libraries\\chromedriver_win32\\chromedriver.exe";
	public WebDriver driver;
	
	
	@Test
	public void test2() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	
}
