package com.qa.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementandElements {

	public static void main(String[] args) {
		
		
		//to find all the links on the webpage
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\8pmSelenium\\AmazonWebAutomationFramework\\src\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();		//maximize the window
		driver.get("https://www.amazon.in");
		
		List <WebElement> linksonHomepage = driver.findElements(By.tagName("a"));
		int count = linksonHomepage.size();
		
		System.out.println(count);
		
		for(int i=0;i<count; i++)
		{
			System.out.println(linksonHomepage.get(i).getText());
		}
		
		
		
		
	}

}
