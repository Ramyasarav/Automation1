package com.pages;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;

public class HomePageTset extends BaseTest {
	
	HomePage hp;
	@BeforeClass
	public void initialize(){
		hp= new HomePage(driver);
		
	}
	@Test
	public void testCountTopNavigation(){
		int actual= hp.countTopNavigation();
		Assert.assertEquals(actual, 13);
	}
	
	@Test
	public void testClickSignin(){
		String actual = hp.ClickSignin();
		Assert.assertEquals(" https://www.macys.com/account/signin?cm_sp=navigation-_-top_nav-_-signin",actual);
	}

}
