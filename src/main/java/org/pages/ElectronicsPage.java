package org.pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tc001check.MobileTestProjectSpecific;

public class ElectronicsPage extends MobileTestProjectSpecific {
	public AddToCartPage clickImage() {
	
	driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
	Set<String> windowHandles = driver.getWindowHandles();
	ArrayList<String> windowHandlesList = new ArrayList<String>(windowHandles);
	driver.switchTo().window(windowHandlesList.get(1));
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//input[@id='add-to-cart-button']")));
	driver.findElementByXPath("//input[@id='add-to-cart-button']").click();
	return new AddToCartPage();
	}

}
