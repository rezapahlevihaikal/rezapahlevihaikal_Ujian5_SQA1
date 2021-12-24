package com.juaracoding.automationpractice.main;

import org.openqa.selenium.WebDriver;

import com.juaracoding.automationpractice.driver.DriverSingleton;
import com.juaracoding.automationpractice.formsignin.FormSignIn;
import com.juaracoding.automationpractice.login.Login;
import com.juaracoding.automationpractice.order.Order;
import com.juaracoding.automationpractice.signin.SignIn;

public class MainApp {
	public static void main(String []args) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("http://automationpractice.com/index.php");
		
		SignIn si = new SignIn();
		si.clickButtonSignIn();
//		si.createEmail("reza@test.com");
//		si.confirmSubmit();
		
		
		Login lo = new Login();
		lo.login("reza@test.com", "12345678abc");
		
		Order od = new Order();
		od.goShop();
		od.orderDress();
		od.addToCartDress();
		od.continueShop();
		od.clickTshirt();
		od.orderTshirt();
		od.addToCartTshirt();
		od.proceedToCheckout();
		od.proceedToCheckoutAll();
		od.proceedToCheckoutAll2("Jangan Pake Sambel");
		od.shippingOrder();
		od.paymentMethod();
		od.confirmOrder();
		
//		FormSignIn se = new FormSignIn();
//		se.radioGender(1);
//		se.inputCustomerName("Reza", "Pahlevi");
//		se.inputPassword("12345678abc");
//		se.chooseDays("22");
//		se.chooseMonths("6");
//		se.chooseYears("1998");
//		se.checkNews();
//		se.checkOpt();
//		se.inputName("Reza", "Pahlevi");
//		se.inputCompany("PT. Mencari Cinta Sejat");
//		se.inputAddress("Bekasi", "Jawa Barat");
//		se.inputCity("Payakumbuh");
//		se.chooseState("Idaho");
//		se.inputPostalCode("17510");
//		se.inputAddInfo("Jangan Bete");
//		se.inputPhone("081234344554");
//		se.inputMobilePhone("12334454253");
//		se.inputAlias("WKWKWKW");
//		se.submitForm();
//		
		
	}
}
