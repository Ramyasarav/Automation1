package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.ClickAction;

import com.base.BasePage;
import com.util.PageDriver;


public class SiginPage extends BasePage {
	
	public SiginPage(PageDriver driver){
		super(driver);			
	}
public String InvalidSignin(String uName,String pwd){
	
	String error = null;
	driver.maximize();
	driver.findElement(By.id("email" )).sendKeys(uName);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.id("signInBtn")).click();
	driver.findElement(By.id("generalErrorMsg")).getText();
	return error;
	
}
}
