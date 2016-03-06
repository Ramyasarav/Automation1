package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BasePage;
import com.util.PageDriver;

public class HomePage extends BasePage {
	
	public HomePage(PageDriver driver){
		super(driver);
		
	}
			

public int countTopNavigation(){
	
	int count = 0;
	driver.maximize();
	List<WebElement> elements =	driver.findElements(By.xpath("html/body/div[4]/div[1]/header/div[3]"));
	if(!elements.isEmpty()){
		
	}
	count = elements.size();
	return count;
}
public String ClickSignin(){
	
	String url= null;
	driver.findElement(By.xpath("html/body/div[4]/div[1]/header/nav/ul/li[3]/a")).click();
	url = driver.getCurrenturl();
	return url;
	
	
}

}
