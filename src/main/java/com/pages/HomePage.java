package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.configuration.Base;

public class HomePage {
	
	By dashboardheading =By.xpath("//h6[text()='Dashboard']");
	By profileclick=By.xpath("//p[text()='Paul Collings']");
	By Logout =By.xpath("//a[text()='Logout']");
	
	
public String  homeDashboardDisplayedorNot() {
		
	
	return Base.driver.findElement(dashboardheading).getText();	
	
	}
public void userProfileButtonClick() {
	Base.driver.findElement(profileclick).click();
	
}

public boolean logoutButtonDisplayedorNot()
{
	return Base.driver.findElement(Logout).isDisplayed();
}

}

