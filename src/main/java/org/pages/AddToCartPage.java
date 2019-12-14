package org.pages;

import org.tc001check.MobileTestProjectSpecific;

public class AddToCartPage extends MobileTestProjectSpecific {
	public LoginPage clickProceedToPay() {
		driver.findElementById("hlb-ptc-btn-native").click();
		return new LoginPage();
	}
	

}
