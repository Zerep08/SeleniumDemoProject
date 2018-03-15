package com.selenium.test.SeleniumDemoProject;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	ChromeDriver driver;

	public OpenBrowser(ChromeDriver driver) {
		super();
		this.driver = driver;
	}

	public void OpenChromeToLandUltimatix() {
		driver.get("https://auth.ultimatix.net/utxLogin");
		driver.manage().window().maximize();

	}

}
