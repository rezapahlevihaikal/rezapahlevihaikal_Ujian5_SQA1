package com.juaracoding.automationpractice.driver;

import com.juaracoding.automationpractice.driver.Chrome;
import com.juaracoding.automationpractice.driver.DriverStrategy;
import com.juaracoding.automationpractice.driver.Firefox;

public class DriverStrategyImplementator {
	public static DriverStrategy chooseStrategy(String strategy) {
		switch(strategy) {
		case "chrome" :
			return new Chrome();
		case "firefox" :
			return new Firefox();
		default :
			return null;
		}
	}
}
