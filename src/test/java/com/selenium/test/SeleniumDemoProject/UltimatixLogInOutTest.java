package com.selenium.test.SeleniumDemoProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UltimatixLogInOutTest {
	String pwd = "";
	WebDriver driver = new ChromeDriver();
	WebDriverWait d = new WebDriverWait(driver, 20);

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1459751\\Documents\\Libraries\\chromedriver_win32\\chromedriver.exe");
	}

	@Before
	public void StartUp() {
		System.out.println("Inside the Before");
		driver.get("https://auth.ultimatix.net/utxLogin");
		driver.manage().window().maximize();
	}

	@Test
	public void logInOut() {
		System.out.println("Inside the test");
		driver.findElement(By.id("USER")).sendKeys("");

		driver.findElement(By.id("PASSWORD")).sendKeys(pwd);

		driver.findElement(By.xpath("//input[@value='Login']")).click();

		String strTitle = driver.getTitle();

		System.out.println(strTitle);
		assertEquals("Home : Ultimatix - Digitally Connected !", strTitle);

		d.until(ExpectedConditions.elementToBeClickable(By.id("uam_modal")));
		driver.findElement(By.id("uam_modal")).click();

		d.until(ExpectedConditions.elementToBeClickable(By.id("logoutbutton")));
		driver.findElement(By.id("logoutbutton")).click();
	}

	@After
	public void closeSession() {
		System.out.println("Inside the after");
		driver.close();
	}

}
