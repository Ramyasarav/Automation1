package com.pages;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;

public class SigninPageTest extends BaseTest {
	SiginPage sp;
	HomePage hp;
	
	@BeforeClass
	public void initialize(){
		hp=new HomePage(driver);
		hp.ClickSignin();
		sp= new SiginPage(driver);
		
	}
	@Test
	public void testInvaidSignin(){
		String actString = sp.InvalidSignin("addy@yahoo.com","dhuuas");
	Assert.assertEquals("Please try again.We weren't able to find the email address and password combination you entered.Remember:Your password is case sensitive; please make sure CAPS lock is turned off.Forgot your password? Reset it now.",actString);

		
	}
	
	
	

}
