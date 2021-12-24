package com.juaracoding.automationpractice.formsignin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import com.juaracoding.automationpractice.driver.DriverSingleton;

public class FormSignIn {
	private WebDriver driver;
	private Select se;
	
	public FormSignIn() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css = "#account-creation_form > div:nth-child(1) > div.clearfix > div:nth-child(3) > label")
	private WebElement radioGenderMale;
	
	@FindBy(css = "#account-creation_form > div:nth-child(1) > div.clearfix > div:nth-child(4) > label")
	private WebElement radioGenderFemale;
	
	public void radioGender(int selection) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 500);");
		
		switch(selection) {
		case 1 :
			radioGenderMale.click();
			break;
		case 2 :
			radioGenderFemale.click();
			break;
		}
		
	}
	
	
	@FindBy(id = "customer_firstname")
	private WebElement txtCustomerFirstName;
	
	@FindBy(id = "customer_lastname")
	private WebElement txtCustomerLastName;
	
	public void inputCustomerName(String firstName, String lastName) {
		txtCustomerFirstName.sendKeys(firstName);
		txtCustomerLastName.sendKeys(lastName);
	}
	
	
	@FindBy(id = "passwd")
	private WebElement txtPassword;
	
	public void inputPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	
//	@FindBy(id = "days")
//	private WebElement dropDownDays;
	
//	@FindBy(id = "months")
//	private WebElement dropDownMonths;
//	
//	@FindBy(id = "years")
//	private WebElement dropDownYears;
	
	public void chooseDays(String days) {
		se = new Select(driver.findElement(By.id("days")));
		se.selectByValue(days);
	}
	
	public void chooseMonths(String months) {
		se = new Select(driver.findElement(By.id("months")));
		se.selectByValue(months);
	}

	public void chooseYears(String years) {
		se = new Select(driver.findElement(By.id("years")));
		se.selectByValue(years);
	}
	
	
	@FindBy(id = "newsletter")
	private WebElement checkNewsLetter;
	
	public void checkNews() {
		checkNewsLetter.click();
	}
	
	
	@FindBy(id = "optin")
	private WebElement checkOptin;
	
	public void checkOpt() {
		checkOptin.click();
	}
	
	
	@FindBy(id = "firstname")
	private WebElement txtFirstname;
	
	@FindBy(id = "lastname")
	private WebElement txtLastname;
	
	public void inputName(String fn, String ln) {
		txtFirstname.sendKeys(fn);;
		txtLastname.sendKeys(ln);
	}
	
	@FindBy(id = "company")
	private WebElement txtCompany;
	
	public void inputCompany(String company) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 500);");
		txtCompany.sendKeys(company);
	}
	
	@FindBy(id = "address1")
	private WebElement txtAddress1;
	
	@FindBy(id = "address2")
	private WebElement txtAddress2;
	
	public void inputAddress(String add1, String add2) {
		txtAddress1.sendKeys(add1);
		txtAddress2.sendKeys(add2);
	}
	
	@FindBy(id = "city")
	private WebElement txtCity;
	
	public void inputCity(String city) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 500);");
		txtCity.sendKeys(city);
	}
	
	public void chooseState(String state) {
		se = new Select(driver.findElement(By.id("id_state")));
		se.selectByVisibleText(state);
	}
	
	@FindBy(id = "postcode")
	private WebElement txtPostalCode;
	
	public void inputPostalCode(String postcode) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 500);");
		txtPostalCode.sendKeys(postcode);
	}
	
	@FindBy(id = "other")
	private WebElement txtAdditionalInformation;
	
	public void inputAddInfo(String addInfo) {
		txtAdditionalInformation.sendKeys(addInfo);
	}
	
	@FindBy(id = "phone")
	private WebElement txtPhone;
	
	public void inputPhone(String phone) {
		txtPhone.sendKeys(phone);
	}
	
	@FindBy(id = "phone_mobile")
	private WebElement txtMobilePhone;
	
	public void inputMobilePhone(String mobilePhone) {
		txtMobilePhone.sendKeys(mobilePhone);
	}
	
	@FindBy(id = "alias")
	private WebElement txtAlias;
	
	public void inputAlias(String alias) {
		txtAlias.sendKeys(alias);
	}
	
	@FindBy(id = "submitAccount")
	private WebElement btnSubmit;
	
	public void submitForm() {
		btnSubmit.click();
	}
}
