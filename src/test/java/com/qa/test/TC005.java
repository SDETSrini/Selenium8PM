package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC005 {

	public static void main(String[] args) throws InterruptedException {
		
//		By ClassName - How ot use it?
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srini\\8pmSelenium\\AmazonWebAutomationFramework\\src\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize the window
		driver.get("https://www.amazon.in");
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("Java");
		
		driver.close();
		
	}

}
