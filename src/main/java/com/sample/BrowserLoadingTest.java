package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLoadingTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//driver.close();
		chromeBrowserTest();
		firefoxBrowserTest();
		edgeBrowserTest();
	}
	public static void chromeBrowserTest() throws InterruptedException
	{

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		System.out.println("Page title is : " + driver.getTitle());
		String url = driver.getCurrentUrl();
		System.out.println("Current url is : " +url);
		Thread.sleep(2000);
		driver.close();
}
	
	public static void firefoxBrowserTest() throws InterruptedException
	{

		WebDriver driver1= new FirefoxDriver();
		driver1.get("https://www.google.co.in/");
		driver1.manage().window().maximize();
		System.out.println("Page title is : " + driver1.getTitle());
		String url = driver1.getCurrentUrl();
		System.out.println("Current url is : " +url);
		Thread.sleep(2000);
		driver1.close();
}
	public static void edgeBrowserTest() throws InterruptedException
	{

		WebDriver driver2= new EdgeDriver();
		driver2.get("https://www.google.co.in/");
		driver2.manage().window().maximize();
		System.out.println("Page title is : " + driver2.getTitle());
		String url = driver2.getCurrentUrl();
		System.out.println("Current url is : " +url);
		Thread.sleep(2000);
		driver2.close();
}
}
