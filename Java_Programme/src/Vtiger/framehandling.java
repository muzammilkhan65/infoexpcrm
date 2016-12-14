package Vtiger;

import org.openqa.selenium.firefox.FirefoxDriver;

public class framehandling {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http:espncricket.com/");
		
		// id aur name
		//indexing number
		// according to webfelements
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		
		
		
	}

}
