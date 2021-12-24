package com.juaracoding.automationpractice.signin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.automationpractice.driver.DriverSingleton;

public class SignIn {
	private WebDriver driver;
	
	public SignIn() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='header_user_info']//a[contains(@href, 'http://automationpractice.com/index.php?controller=my-account')]")
	private WebElement btnSignIn;
	
	public void clickButtonSignIn() {
		btnSignIn.click();
	}
	
	
	@FindBy(id ="email_create")
	private WebElement txtEmailCreate;
	
	public void createEmail(String email) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 50);");
		txtEmailCreate.sendKeys(email);
	}
	
	
	@FindBy(id = "SubmitCreate")
	private WebElement btnCreateAccount;
	
	public void confirmSubmit() {
		btnCreateAccount.click();
	}
}
