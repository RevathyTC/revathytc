package org.pages;

import org.tc001check.MobileTestProjectSpecific;

public class LoginPage extends MobileTestProjectSpecific{
	public LoginPage clickContinueButton () {
		driver.findElementByXPath("//input[@id='continue']").click();
		return this;
		
	}
	

}
