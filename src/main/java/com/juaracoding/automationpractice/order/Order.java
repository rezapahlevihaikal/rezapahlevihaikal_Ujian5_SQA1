package com.juaracoding.automationpractice.order;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.automationpractice.driver.DriverSingleton;

public class Order {
	private WebDriver driver;
	
	public Order() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class=\"footer_links clearfix\"]//li//a[contains(@href, 'http://automationpractice.com')]")
//	@FindBy(css = "#center_column > ul > li > a")
//	@FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
	private WebElement gotoShop;
	
	public void goShop() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 500);");
		gotoShop.click();
	}
	
	@FindBy(css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > h5 > a")
	private WebElement btnOrderDress;
	
	public void orderDress() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 800);");
		btnOrderDress.click();
	}
	
	@FindBy(id = "add_to_cart")
	private WebElement btnAddToCartDress;
	
	public void addToCartDress() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 500);");
		btnAddToCartDress.click();
	}
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span")
	private WebElement btnContinue;
	
	public void continueShop() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 500);");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(btnContinue));
		
		btnContinue.click();
	}
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(3)")
	private WebElement btnTshirt;
	
	public void clickTshirt() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, -500);");
		
		btnTshirt.click();;
	}
	
	@FindBy(css = "#center_column > ul > li > div > div.right-block > h5 > a")
	private WebElement orderTshirt;
	
	public void orderTshirt() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 800);");
		orderTshirt.click();
	}
	
	@FindBy(id = "add_to_cart")
	private WebElement btnAddToCartTshirt;
	
	public void addToCartTshirt() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 800);");
		btnAddToCartTshirt.click();
	}
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
	private WebElement btnProceedToCheckout;
	
	public void proceedToCheckout() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 500);");
		btnProceedToCheckout.click();;
	}
	
	@FindBy(css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
	private WebElement btnProceedToCheckout2;
	
	public void proceedToCheckoutAll() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 800);");
		btnProceedToCheckout2.click();
	}
	
	@FindBy(css = "#ordermsg > textarea")
	private WebElement txtOrderMessage;
	
	@FindBy(css = "#center_column > form > p > button")
	private WebElement btnProceedToCheckout3;
	
	public void proceedToCheckoutAll2(String orderMessage) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 800);");
		txtOrderMessage.sendKeys(orderMessage);
		btnProceedToCheckout3.click();;
	}
	
	@FindBy(id = "cgv")
	private WebElement checkTerms;
	
	@FindBy(css = "#form > p > button")
	private WebElement btnPtc;
	
	public void shippingOrder() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 800);");
		checkTerms.click();
		btnPtc.click();;
	}
	
	@FindBy(css = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a")
	private WebElement btnPayment;
	
	public void paymentMethod() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 800);");
		btnPayment.click();
	}
	
	
	@FindBy(css = "#cart_navigation > button")
	private WebElement btnConfirm;
	
	public void confirmOrder() {
		btnConfirm.click();
	}
}
