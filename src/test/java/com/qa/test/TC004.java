package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004 {

	public static void main(String[] args) {
		
		//Learning partialLinkText- not advisable to use partialLinkText
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srini\\8pmSelenium\\AmazonWebAutomationFramework\\src\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize the window
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.partialLinkText("Mobil")).click();

	}

}
