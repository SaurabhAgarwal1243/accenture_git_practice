package com.acc_selenium_prac1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing_2 {
	
	@BeforeTest
	public void launch_Browser(){
		System.out.println("Launch Browser");
	}
	@BeforeTest
	public void launch_Browser2(){
		System.out.println("Launch Browsera");
	}
	
	@AfterTest
	public void close_Browser(){
		System.out.println("close Browser");
	}
	
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method");
	}
	
	
	@Test(priority=2)
	public void facebook(){
		
		System.out.println("I am using facebook");
		
	}
	
	
	@Test(priority=1)
	public void google(){
		System.out.println("I am using google");
		
	}
	
	@Test(priority=3)
	public void gmail(){
		System.out.println("I am using gmail");
		
	}
	

}
