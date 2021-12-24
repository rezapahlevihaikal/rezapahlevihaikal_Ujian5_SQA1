package com.juaracoding.automationpractice.login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.automationpractice.driver.DriverSingleton;

public class Login {
	private WebDriver driver;
	
	public Login() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement txtEmail;
	
	@FindBy(id = "passwd")
	private WebElement txtPassword;
	
	@FindBy(id = "SubmitLogin")
	private WebElement btnSubmitLogin;
	
	public void login(String email, String password) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 300);");
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(password);
		btnSubmitLogin.click();
	}

}
