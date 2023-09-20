package com.obsquracourse.AutomationTesting;

public class NavigatingCommands extends Base {
	
	public void navigation() {
		driver.navigate().to("https://www.toolsqa.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigatingCommands navigatingcommands=new NavigatingCommands();
		navigatingcommands.initializeBrowser();
		navigatingcommands.navigation();
		navigatingcommands.driverclose();
		

	}
	

}
