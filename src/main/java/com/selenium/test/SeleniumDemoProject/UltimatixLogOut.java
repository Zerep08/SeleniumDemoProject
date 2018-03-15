package com.selenium.test.SeleniumDemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UltimatixLogOut {
	ChromeDriver driver;
	
	
	public UltimatixLogOut(ChromeDriver driver) {
		super();
		this.driver = driver;
	}


	public void logOut() {
		WebDriverWait d = new WebDriverWait(driver, 20);
		
		d.until(ExpectedConditions.elementToBeClickable(By.id("uam_modal")));
		driver.findElement(By.id("uam_modal")).click();
		
		
		d.until(ExpectedConditions.elementToBeClickable(By.id("logoutbutton")));
		driver.findElement(By.id("logoutbutton")).click();
	}

}
