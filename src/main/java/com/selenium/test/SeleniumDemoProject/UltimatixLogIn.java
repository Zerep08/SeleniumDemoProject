package com.selenium.test.SeleniumDemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimatixLogIn {
	ChromeDriver driver;
	
	
	
	public UltimatixLogIn(ChromeDriver driver) {
		super();
		this.driver = driver;
	}



	public void login() {
		driver.findElement(By.id("USER")).sendKeys("1459751");

		driver.findElement(By.id("PASSWORD")).sendKeys(new SetupEnvironment().pwd);

		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}
