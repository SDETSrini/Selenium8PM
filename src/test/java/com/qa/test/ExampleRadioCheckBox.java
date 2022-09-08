package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleRadioCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		//Validate that English Checkbox is not selected by default
		// How to not Enter the if Statement code  - Srini to come back
				

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\8pmSelenium\\AmazonWebAutomationFramework\\src\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();		//maximize the window
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.xpath("//*[@aria-label='Search']")).sendKeys("Java by E Balaguruswamy");	
		driver.findElement(By.xpath("(//*[@class='nav-input nav-progressive-attribute'])[2]")).click();
		
		Thread.sleep(5000);
		
//		class="a-icon a-icon-checkbox
		
//		driver.findElement(By.xpath("//*[@class='a-icon a-icon-checkbox']")).click();
		
//		driver.findElement(By.xpath("(//*[@type='checkbox'])[3]")).click();
		
		boolean val =driver.findElement(By.xpath("(//*[@type='checkbox'])[3]")).isSelected();
				
		if (val==false)
		{
			System.out.println("English Checkbox is not selected by default");
		}
		
		
		driver.close();
		
		
		
	}

}
