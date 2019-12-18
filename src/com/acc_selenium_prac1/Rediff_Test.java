package com.acc_selenium_prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff_Test {
	WebDriver driver;
	@BeforeTest
	
	public void launch_test(){
		System.out.println("Test Started");
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		int no_of_frames = driver.findElements(By.tagName("frame")).size();
		System.out.println("total frames" + " " + no_of_frames);
	}
	
	@Test
	public void signup() throws InterruptedException{
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Saurabh");;
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("saurabh1253");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		//if(driver.findElement(By.id("check_availability"))==)
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("saurabh1243");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("saurabh1243");
		driver.findElement(By.xpath("//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input")).sendKeys("saurabh@gmail.com");
//		WebElement question = driver.findElement(By.xpath("//input[@id='hid_countryCode']"));
//		Select sl = new Select(question);
//		sl.selectByValue("91");
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("9811293160");
		WebElement day = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select s1 = new Select(day);
		s1.selectByValue("23");
		WebElement month = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select s2 = new Select(month);
		s2.selectByValue("12");
		WebElement year = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select s3 = new Select(year);
		s3.selectByValue("1996");
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[2]")).click();
		
		WebElement cnt = driver.findElement(By.xpath("//*[@id='country']"));
		Select s4 = new Select(cnt);
		s4.selectByValue("99");
		
		WebElement city = driver.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select"));
		Select s5 = new Select(city);
		s5.selectByValue("Delhi");
		
		driver.findElement(By.xpath("//*[@id='Register']")).click();
		
		Thread.sleep(3000);
		
	}
	
@AfterTest
	
	public void check(){
		System.out.println("Test Passed");
		driver.close();
	}

}
