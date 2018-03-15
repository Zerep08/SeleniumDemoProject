package com.selenium.test.SeleniumDemoProject;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


@RunWith(Parameterized.class)
public class SearchGoogleTest {
	String data;
	
	WebDriver driver = new ChromeDriver();
	WebDriverWait d = new WebDriverWait(driver, 20);
	
	
	public SearchGoogleTest(String data) {
		super();
		this.data = data;
	}

	@BeforeClass
	public static void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1459751\\Documents\\Libraries\\chromedriver_win32\\chromedriver.exe");
	}
	
	@Before
	public void start() {
		System.out.println("Iniciando test de google");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com.mx");
	}
	
	@Parameterized.Parameters
	public static Collection input(){
		
		return Arrays.asList(new Object[]{"hola","como","estas"});
		
	}
	
	@Test
	public void search() {
		driver.findElement(By.id("lst-ib")).sendKeys(data);
		
	}
	
	@After
	public void end() {
		//driver.close();
	}
}
