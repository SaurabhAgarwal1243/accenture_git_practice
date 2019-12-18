package com.acc_selenium_prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtours_demo {
	WebDriver driver;;
	
	@BeforeTest
	
	public void launch_browser(){
		System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
	}
	
	
	@AfterTest
	
	public void close_browser(){
		driver.close();
	}
	
	
	@Test
	
	public void registration() throws InterruptedException{

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello Selenium How are you");
		
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Saurabh");
		driver.findElement(By.name("lastName")).sendKeys("Agarwal");
		driver.findElement(By.name("phone")).sendKeys("9811293160");
		driver.findElement(By.name("userName")).sendKeys("hrms.saurabh@gmail.com");
		WebElement cnt = driver.findElement(By.name("country"));
		Select sl = new Select(cnt);
		sl.selectByVisibleText("INDIA");
		Thread.sleep(2000);
//		sl.selectByValue("94");
//		Thread.sleep(2000);
//		sl.selectByIndex(96);
//		Thread.sleep(2000);
		driver.findElement(By.name("register")).click();
		Thread.sleep(2000);
		
		
	}

}
