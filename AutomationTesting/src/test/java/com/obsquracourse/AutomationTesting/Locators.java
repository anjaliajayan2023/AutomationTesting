package com.obsquracourse.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public void webLocators() {
		WebElement showmessagebutton = driver.findElement(By.id("button-one"));
		WebElement entermessage = driver.findElement(By.id("single-input-field"));
		WebElement yourmessage = driver.findElement(By.id("message-one"));
		WebElement entervaluea = driver.findElement(By.id("value-a"));
		WebElement entervalueb = driver.findElement(By.id("value-b"));
		WebElement gettotal = driver.findElement(By.id("button-two"));

		WebElement clearfix = driver.findElement(By.className("clearfix"));
		WebElement showmessageusingcssselector = driver.findElement(By.cssSelector("button#button-one"));
		WebElement clearfixusingclass = driver.findElement(By.cssSelector("section.clearfix"));
		WebElement showmessageusingattribute = driver.findElement(By.cssSelector("button[id=button-one]"));

		WebElement hometab = driver.findElement(By.className("nav-link"));
		WebElement simpleformdemotab = driver.findElement(By.className("list-group-item"));
		WebElement entermessageusingclass = driver.findElement(By.className("form-control"));

		WebElement checkboxdemo = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement checkbox = driver.findElement(By.partialLinkText("Checkbox"));
		WebElement showmessageusingxpath = driver.findElement(By.xpath("//button[@id='button-one']"));
		
		
		
		
		
		//using contains()
		
		WebElement yourmessageusingcontains=driver.findElement(By.xpath("//div[contains(@id,'message-one')]"));
		WebElement totaltab=driver.findElement(By.xpath("//div[contains(@id,'message-two')]"));
		
		WebElement showmsgtext=driver.findElement(By.xpath("//button[text()='Show Message']"));
		
		

		driver.navigate().to("https://www.amazon.in");
		
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		WebElement amazonlogo = driver.findElement(By.id("nav-logo-sprites"));
		WebElement amazoncart = driver.findElement(By.id("nav-cart-count"));
		WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox"));

		WebElement alltab = driver.findElement(By.className("hm-icon-label"));
		WebElement searchfieldusingclass = driver.findElement(By.className("nav-input"));

		// css selector-tag#id
		
		WebElement searchfieldusingcssselector = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		WebElement searchbuttonusingcssselector = driver.findElement(By.cssSelector("input#nav-search-submit-button"));
		WebElement amazoncartusingcssselector = driver.findElement(By.cssSelector("span#nav-cart-count"));
		// css selector-tag.class
		
		WebElement amazonlogousingcsslocator = driver
				.findElement(By.cssSelector("a.nav-logo-link.nav-progressive-attribute"));
		WebElement deliveryaddrestabusingcsslocator = driver
				.findElement(By.cssSelector("span.a-declarative.nav-progressive-attribute"));
		WebElement cartusingcssselector = driver.findElement(By.cssSelector("span.nav-cart-count"));
		
		// css selector-tag[attribute=value]
		
		WebElement alltabusingcssselector = driver.findElement(By.cssSelector("span[class=hm-icon-label]"));
		WebElement searchbuttonusingattribute = driver.findElement(By.cssSelector("input[type=submit]"));
		
		//using Xpath
		WebElement searchusingxpath=driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));

		// using class
		
		driver.navigate().to("https://www.google.com");
		WebElement googletextfield = driver.findElement(By.className("gLFyf"));
		
		
		//using Xpath
		driver.navigate().to("https://www.flipkart.com");
		WebElement searchfieldusingxpath = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement flipkartlogo = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		
		
		// using name attribute
	//driver.navigate().to("https://netbanking.hdfcbank.com/netbanking");
	//	WebElement customerid=driver.findElement(By.name("fldLoginUserId"));
		
		driver.navigate().to("https://www.facebook.com/login");
	WebElement usernme=driver.findElement(By.name("email"));
	WebElement passwrd=driver.findElement(By.name("pass"));
		
		
       
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locators = new Locators();
		locators.initializeBrowser();
		locators.webLocators();
		locators.driverclose();	

	}

}
