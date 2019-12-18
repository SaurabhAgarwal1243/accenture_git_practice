package com.acc_selenium_prac1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Rediff_alert {
	
	WebDriver driver;
	
	
	@Test
	
	public void check_alert() throws InterruptedException{
		System.out.println("Test Started");
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Alert al = driver.switchTo().alert();
		String txt = al.getText();
		
		System.out.println(txt);
		
		Assert.assertEquals(txt, "Please enter a valid user name");
		System.out.println("Test Passed");
		Thread.sleep(2000);
		al.accept();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("Saurabh");
	}
	
	

}
