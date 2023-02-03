package com.pages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.configuration.Base;

public class HomePageTest extends Base{ 
	LoginPage obj =new LoginPage();
	HomePage objhome =new HomePage();
	
	@BeforeMethod
	public void setUp() {
		initialisation();
	}
	@Test
	
	public void dashboardDisplayTest() throws InterruptedException {
	
	obj.loginApplication();
	Thread.sleep(2000);
	String textvalue=objhome.homeDashboardDisplayedorNot();
	Assert.assertEquals(textvalue,"Dashboard");
	
	}
	
	@Test
	public void logutButtonDisplayTest() throws InterruptedException {
		
		obj.loginApplication();
		Thread.sleep(2000);
		objhome.userProfileButtonClick();
		Thread.sleep(2000);
		boolean logoutdata=objhome.logoutButtonDisplayedorNot();
		Assert.assertEquals(logoutdata, true);	
		
		}
	@AfterMethod
	public void claenup()
	{
		driver.close();
	}
	}
	

