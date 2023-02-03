package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrosrLoadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chromeBrowserLoad();

	}
	
	public static void chromeBrowserLoad()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Page title is "+driver.getTitle());
		String url=driver.getCurrentUrl();
		System.out.println("Current url is "+url);
	}
	}


