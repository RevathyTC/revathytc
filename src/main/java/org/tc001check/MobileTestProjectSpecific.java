package org.tc001check;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.utils.DataUsingExcel;

public class MobileTestProjectSpecific {
public static ChromeDriver driver;
String excelFileName = null;
	@BeforeMethod
	public void loginApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void logout() {
		driver.close();
	}
//	
//	@DataProvider
//	public Object[][] fetchData() throws IOException {
//		DataUsingExcel data = new DataUsingExcel();
//		return data.readExcel(excelFileName);
//		
//		
//	}
	
	
	

}
