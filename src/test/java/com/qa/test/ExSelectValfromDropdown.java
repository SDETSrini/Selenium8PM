package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExSelectValfromDropdown {

	public static void main(String[] args) throws InterruptedException {


		// Select Books from the dropdown
		//Option 1  - find the element and use SendKeys to key in the value
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\8pmSelenium\\AmazonWebAutomationFramework\\src\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();		//maximize the window
		driver.get("https://www.amazon.in");
		
		//Option 1  - find the element and use SendKeys to key in the value
//		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//Option 2 - Select Class
		Select text = new Select(driver.findElement(By.xpath("//*[@aria-describedby='searchDropdownDescription']")));
		
		//Option1
//		text.selectByIndex(10);
		
		//Option2
		text.selectByVisibleText("Books");
		
		Thread.sleep(5000);
		
		driver.close();
		
		

	}

}
