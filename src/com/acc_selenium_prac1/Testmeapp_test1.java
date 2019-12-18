package com.acc_selenium_prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testmeapp_test1 {
	WebDriver driver;
	@BeforeTest
	
	public void launch_test(){
		System.out.println("Test Started");
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
//		int no_of_frames = driver.findElements(By.tagName("frame")).size();
//		System.out.println("total frames" + " " + no_of_frames);
	}
	
	@Test
	
	public void sign_up() throws InterruptedException{
		driver.findElement(By.linkText("SignUp")).click();
		
		driver.findElement(By.name("userName")).sendKeys("saurabh1243");
		driver.findElement(By.name("firstName")).sendKeys("Saurabh");
		driver.findElement(By.name("lastName")).sendKeys("Agarwal");
		driver.findElement(By.name("password")).sendKeys("saurabh");
		driver.findElement(By.name("confirmPassword")).sendKeys("saurabh");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("saurabh@gmail.com");
		driver.findElement(By.name("mobileNumber")).sendKeys("9811293160");
		driver.findElement(By.name("dob")).sendKeys("23/12/1996");
		driver.findElement(By.name("address")).sendKeys("skefbsfhsefhsehfshf");
		WebElement question = driver.findElement(By.name("securityQuestion"));
		Select sl = new Select(question);
		sl.selectByVisibleText("What is your Birth Place?");
		driver.findElement(By.name("answer")).sendKeys("Delhi");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);

	}
	
	@AfterTest
	
	public void check(){
		System.out.println("Test Passed");
		driver.close();
	}

}
