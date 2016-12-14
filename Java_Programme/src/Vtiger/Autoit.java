package Vtiger;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class Autoit {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("www.http:sendspace.com/");
		
		driver.findElement(By.xpath("//a[@name=download_ue]")).sendKeys("C://Users//Max//Desktop//JavaBasics//Java_Programme//testng.xml");
		
		Actions actobj=new Actions(driver);
		actobj.moveToElement(driver.findElement(By.xpath("//a[@class='nameee']"))).sendKeys("C://Users//Max//Desktop");
		
		File fileObj=new File("autoit_dll\\jacob-1.18-x64.dll");
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, fileObj.getAbsolutePath());
		
		AutoItX autoObj=new AutoItX();
		autoObj.winActivate("Upload_File");							//upload_file is a window title for upload in chrome
		autoObj.ControlSetText("Upload_File", "", "Edit", "");
	}

}
