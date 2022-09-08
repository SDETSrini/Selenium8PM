package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExBrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		// Navigation - BrowserElements

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\8pmSelenium\\AmazonWebAutomationFramework\\src\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();		//maximize the window
		driver.get("https://www.amazon.in");
			
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(5000);
		
		driver.navigate().back();  // one Step Back
		
		driver.navigate().forward();  // one Step fwd
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();  // reload the page
		
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
