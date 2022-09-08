package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003 {

	public static void main(String[] args) {
		// On Amazon HomePage - > Click on About Us - How to use LinkText Locator Strategy

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srini\\8pmSelenium\\AmazonWebAutomationFramework\\src\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize the window
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.linkText("About Us")).click();
		
		String aboutUsPgTitle  = driver.getTitle();
		System.out.println(aboutUsPgTitle);
		
		driver.close();

	}

}
