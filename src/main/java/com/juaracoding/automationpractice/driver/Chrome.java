package com.juaracoding.automationpractice.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements DriverStrategy{

	@Override
	public WebDriver setStrategy() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/app/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
