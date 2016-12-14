package extentreport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShot {

	public static String  capturescreenshot(WebDriver driver, String Screenshotname) {
		
		
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Scrfile=ts.getScreenshotAs(OutputType.FILE);
		String dest="C:\\Users\\Max\\git\\infocrmexpress\\Java_Programme\\screenshot"+Screenshotname+" .png";
		
		File destination = new File(dest);
	
		
	    FileUtils.copyFile(Scrfile, destination);
		System.out.println("screenshot taken");
			return dest;	
		}
		catch (Exception e){
			System.out.println("exception while taking screeenshot" +e.getMessage());
			  return e.getMessage();
		}
		
	
	
	}

}
