package com.acc_selenium_prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hdfc_netbanking {
	WebDriver driver;
	
	@BeforeTest
	
	public void launch_browser(){
		System.out.println("Test Started");
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		int no_of_frames = driver.findElements(By.tagName("frame")).size();
		System.out.println("total frames" + " " + no_of_frames);

	}
	
	@Test
	
	public void customer_id() throws InterruptedException{
		driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("1234554");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		Thread.sleep(2000);
	}
	
	@AfterTest
	
	public void check(){
		System.out.println("Test Passed");
		//driver.close();
		
	}

}
