package com.selenium.test.SeleniumDemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	static WebDriver driver;
	
public static void main(String[] args) {
	try {
		/*
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\1459756\\Documents\\Selenium\\Utilities\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		*/
		
		
		
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\1459751\\Documents\\Libraries\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		/*
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1459756\\Documents\\Selenium\\Utilities\\chromedriver.exe");
		driver = new ChromeDriver();
		 */
		String baseURL = "https://www.serebii.net/index2.shtml";
		String expectedTitle = "Serebii.net - Where Legends Come To Life";
		String lvl="72",hp="204",atk="135",def="142",spatk="284",spdef="182",spd="231";
		//driver.manage().window().maximize();
		driver.get(baseURL);
/*
		if (driver.getTitle().contentEquals(expectedTitle)){
			System.out.println("Page is correct");
		} else {
			System.out.println("Test Failed");
			driver.close();
			System.exit(0);
		}
		driver.findElement(By.linkText("XY & ORAS Pokédex")).click();
		Select pokedex=new Select(driver.findElement(By.xpath(""
				+ "/html/body/table[2]/tbody/tr[2]/td[2]/font/div[3]/table[1]/tbody/tr/"
				+ "td[3]/form/select")));//td[] 1:Kanto/2:Jotho/3:Hoenn/4:Shino/5:Unova/6:Kalos
		pokedex.selectByVisibleText("384 Rayquaza");
		//pokedex.selectByIndex(1); //Used to find element by its internal index.
		driver.findElement(By.xpath(""
				+ "/html/body/table[2]/tbody/tr[2]/td[2]/font/div[2]/div/p[1]/table[5]/tbody/tr[2]/td/table/tbody/tr/td[3]/a")).click();
		//
		driver.findElement(By.linkText("-Sun/Moon IV Calc.")).click();
		driver.findElement(By.linkText("IV Calculator XY")).click();
		//Seeks and Selects a Pokemon
		pokedex=new Select(driver.findElement(By.id("species")));
		pokedex.selectByVisibleText("Latios");
		//Seeks and Selects a Nature
		pokedex=new Select(driver.findElement(By.id("nat")));
		pokedex.selectByVisibleText("Modest");
		//Inserts Values
		driver.findElement(By.id("level-0")).sendKeys(lvl);
		driver.findElement(By.id("stat0-0")).sendKeys(hp);
		driver.findElement(By.id("stat1-0")).sendKeys(atk);
		driver.findElement(By.id("stat2-0")).sendKeys(def);
		driver.findElement(By.id("stat3-0")).sendKeys(spatk);
		driver.findElement(By.id("stat4-0")).sendKeys(spdef);
		driver.findElement(By.id("stat5-0")).sendKeys(spd);
		driver.findElement(By.id("ep3-0")).sendKeys("252");
		driver.findElement(By.id("ep4-0")).sendKeys("6");
		driver.findElement(By.id("ep5-0")).sendKeys("252");

		driver.findElement(By.id("btn-ivs")).click();
*/
		Thread.sleep(5000);
	}catch (Exception e) {
		System.out.println("Error = "+e);
	}
	finally {
		driver.close();
	}
}
}
