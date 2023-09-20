package com.obsquracourse.AutomationTesting;

public class BrowserCommands extends Base {
	
	public  void browserCommands() {
		String url=driver.getCurrentUrl();
		String pagesource=driver.getPageSource();
		String title=driver.getTitle();
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.browserCommands();

	}

}
