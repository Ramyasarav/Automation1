package com.ebay.phonePrice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.*;

public class App 
{
    public  static void phonePrice(String item,int number)  {
    	
    		WebDriver driver = new FirefoxDriver();
    		// System.setProperty("Webdriver.chrome.driver", "C:\\Users\\work\\Downloads\\chromedriver_win32\\chromedriver.exe");
    		 //WebDriver  driver = new ChromeDriver();
    		driver.navigate().to("http://ebay.com/");
    		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    		driver.manage().window().maximize();
    		driver.findElement(By.id("gh-ac")).sendKeys(item);
    		driver.findElement(By.id("gh-btn")).click();
    		List<WebElement> list= driver.findElements(By.xpath(".//*[@class='bold']"));
    		for( int i=0;i<number;i++)
    		{
    			System.out.println(list.get(i).getText());
    		}
    		driver.quit();
    		
    		
    }
}
