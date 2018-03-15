package com.selenium.test.testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test99 {

	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\Users\\1459751\\Documents\\Libraries\\chromedriver_win32\\chromedriver.exe";
	public WebDriver driver;
	public String expected = null;
	public String actual = null;
	
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Before test");

		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@BeforeMethod
	public void verifyHomepageTitle() {
		System.out.println("Before method");
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 0)
	public void register() {
		System.out.println("test 0");
		driver.findElement(By.linkText("REGISTER")).click();
		expected = "Register: Mercury Tours";
		actual = driver.getTitle();
		AssertJUnit.assertEquals(actual, expected);
	}

	@Test(priority = 1)
	public void support() {
		System.out.println("test 1");
		driver.findElement(By.linkText("SUPPORT")).click();
		expected = "Under Construction: Mercury Tours";
		actual = driver.getTitle();
		AssertJUnit.assertEquals(actual, expected);
	}
	
	@Test(groups= {"smoke"})
	public void guru() {
		System.out.println("Ejecutado en grupo");
	}

	@AfterMethod
	public void goBackToHomepage() {
		System.out.println("After method");
		driver.findElement(By.linkText("Home")).click();
	}

	@AfterTest
	public void cleanSetup() {
		driver.close();
	}
	
	

}
