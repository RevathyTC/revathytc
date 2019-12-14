package org.tc001check;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileSearchTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30");
		driver.findElementByXPath("(//input[@type='submit'])[1]").click();
		String firstMobilePrice = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		System.out.println("First mobile price is :" + firstMobilePrice);
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> windowHandlesList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(1));
		String DeliveryDate = driver.findElementByXPath("(//span[@class='a-text-bold'])[4]").getText();
		System.out.println("Delivery Date: " + DeliveryDate);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//input[@id='add-to-cart-button']")));
		driver.findElementByXPath("//input[@id='add-to-cart-button']").click();
		String status = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText();
		if (status.contentEquals("Added to Cart")) {
			System.out.println("Status displayed successfully");

		}
		driver.findElementById("hlb-ptc-btn-native").click();
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("signin"))
		{
			System.out.println("We are currently in sign in page");
		}
		driver.findElementByXPath("//input[@id='continue']").click();
		String text = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		if(text.equalsIgnoreCase("Enter your email or mobile phone number")) {
			System.out.println("Verified successfully");
		}
		

	}
}