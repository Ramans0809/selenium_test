package com.practice.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest{
	@Test
	public void testhelloworld()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.javatpoint.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,5000)");
		
		driver.findElement(By.id("gsc-i-id1")).sendKeys("core Java");
		driver.findElement(By.className("gsc-search-button")).click();
		
	
	}
}
