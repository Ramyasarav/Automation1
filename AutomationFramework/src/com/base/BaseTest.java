package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.util.PageDriver;

public abstract class BaseTest {
	
	public PageDriver driver;
	
	@BeforeSuite
	public void setup(){
		driver = new PageDriver();
	}
	@AfterSuite
	public void quit(){
		driver.quit();
	}
	


}
