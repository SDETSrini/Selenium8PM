package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002 {

	public static void main(String[] args) {
		
		// Enter Text: Java by E Balaguruswamy in the Search bar and Click GO		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\8pmSelenium\\AmazonWebAutomationFramework\\src\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();		//maximize the window
		driver.get("https://www.amazon.in");
		
		//By Using Name
//		driver.findElement(By.name("field-keywords")).sendKeys("Java by E Balaguruswamy");	
		
		//By using Xpath - //tagname[@Attribute='value']
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java by E Balaguruswamy");
//		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("Java by E Balaguruswamy");	
		//input[@id='twotabsearchtextbox']
		//input[@name="field-keywords"]	
		
		
		//input[@aria-label="Search"]
		//*[@aria-label="Search"]
		driver.findElement(By.xpath("//*[@aria-label='Search']")).sendKeys("Java by E Balaguruswamy");	
		
//		driver.findElement(By.xpath(Searchbox)).sendKeys(SearchTxt); - framework 	
		
		
//		(//*[@class='nav-input nav-progressive-attribute'])[2] - 1 of 2 Occurences - Index - Xpath
				
				
//		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//*[@class='nav-input nav-progressive-attribute'])[2]")).click();
		
//		
		String SearchpgTile  = driver.getTitle();
		System.out.println(SearchpgTile);
		
		driver.close();
		
	}

}
