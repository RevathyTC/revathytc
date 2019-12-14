package org.tc001check;

import org.pages.TestCase001;
import org.testng.annotations.Test;

public class TestClass extends MobileTestProjectSpecific {

@Test

public void getIntoPage() {
	new TestCase001()
	.searchMobile()
	.printMobilePrice()
	.clickImage()
	.clickProceedToPay()
	.clickContinueButton();
	
	
	
	
	
}



}
