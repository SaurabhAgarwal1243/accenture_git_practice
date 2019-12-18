package com.acc_selenium_prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class API_Docs {
WebDriver driver;
	
	@BeforeTest
	
	public void launch_browser(){
		System.out.println("Test Started");
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://selenium.dev/selenium/docs/api/java/index.html");
		
		int no_of_frames = driver.findElements(By.tagName("frame")).size();
		System.out.println("total frames" + " " + no_of_frames);

	}
	
	@Test
	
	public void navigate() throws InterruptedException{
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("CommandProcessor")).click();
		
		Thread.sleep(4000);
	}
	
	
	@AfterTest
	
	public void check(){
		System.out.println("Test Passed");
		driver.close();
	}

}
