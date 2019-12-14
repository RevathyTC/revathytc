package org.pages;

import org.tc001check.MobileTestProjectSpecific;

public class ResutPage_01 extends MobileTestProjectSpecific {
	
	public ElectronicsPage printMobilePrice() {
		String firstMobilePrice = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		System.out.println("First mobile price is :" + firstMobilePrice);
		return new ElectronicsPage();
		
		
	}


}
