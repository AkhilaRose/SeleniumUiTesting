package com.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chromeBrowserTest();
	}
	public static void chromeBrowserTest() 
	{

		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		searchButton.click();
		WebElement Dashboardheading= driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		boolean heading = Dashboardheading.isDisplayed();
		System.out.println(heading);
		//driver.close();
}

}
