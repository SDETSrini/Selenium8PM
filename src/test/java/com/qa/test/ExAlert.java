package com.qa.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExAlert {

	public static void main(String[] args) {
		
//		Handle JavaScript pop up
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\8pmSelenium\\AmazonWebAutomationFramework\\src\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		
		driver.manage().window().maximize();		//maximize the window
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				
		driver.findElement(By.xpath("//input[@class = 'signinbtn']")).click();
		
		Alert ar = driver.switchTo().alert();
		
		String alertmsg = ar.getText(); // get the text on the alert popup
		System.out.println(alertmsg);
		
		ar.accept();  // OK Button
		
		
//		ar.dismiss();  // Cancel Button
//		ar.sendKeys("Rohit");  //Enter Value to Text
		
		driver.close();
		
	
	}

}
