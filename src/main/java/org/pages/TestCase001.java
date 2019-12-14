package org.pages;

import org.tc001check.MobileSearchTest;
import org.tc001check.MobileTestProjectSpecific;
import org.testng.annotations.Test;

public class TestCase001 extends MobileTestProjectSpecific  {
	
	
	public ResutPage_01 searchMobile() {
		driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30");
		driver.findElementByXPath("(//input[@type='submit'])[1]").click();
		return new ResutPage_01();
	
		
	}
	
	
	
	
	
	

}
