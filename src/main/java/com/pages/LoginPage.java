package com.pages;

import org.openqa.selenium.By;

import com.configuration.Base;


public class LoginPage {

	By loginheading =By.xpath("//h5[text()='Login']");
	By usename=By.name("username");
	By password =By.name("password");
	By loginbtn=By.xpath("//button[@type='submit']");
	
	public boolean loginHeadingDisplayedorNot() {
		
		return Base.driver.findElement(loginheading).isDisplayed();
		
	}
	public   void loginApplication() {
		
		Base.driver.findElement(usename).sendKeys("Admin");
		Base.driver.findElement(password).sendKeys("admin123");
		Base.driver.findElement(loginbtn).click();
	}
	
	public String loginButtonDisplayedorNot() {
		
		return Base.driver.findElement(loginbtn).getText();
	}
}


