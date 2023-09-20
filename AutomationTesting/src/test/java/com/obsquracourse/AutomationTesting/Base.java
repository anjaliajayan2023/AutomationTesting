package com.obsquracourse.AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {

	public WebDriver driver;
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjali Ajayan\\eclipse-workspace\\AutomationTesting\\src\\main\\java\\com\\obsquracourse\\AutomationTesting\\Resources\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}
	public void driverclose() {
		//driver.close();
		driver.quit();
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base=new Base();
		base.initializeBrowser();
		base.driverclose();
		
		

	}

}
