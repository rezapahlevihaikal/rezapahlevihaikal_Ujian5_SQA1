package com.juaracoding.automationpractice.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy{

	@Override
	public WebDriver setStrategy() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/app/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
