package extentreport;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class seleniumtitle {

	
	static ExtentReports report;
	static ExtentTest logger;
	static WebDriver driver;
	
		
	@Test
	public static void verifyblogtitle(){
		
		report=new ExtentReports("C:\\User\\Max\\git\\infocrmexpress\\Java_Programme\\Extentreport\\report.html");  
		logger=report.startTest("verifyblogtitle" );
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Max\\git\\infocrmexpress\\Java_Programme\\jars\\chromedriver.exe");
		driver=new FirefoxDriver();
		
		 logger.log(LogStatus.INFO, "Browser Launch");
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.Google.com");
		logger.log(LogStatus.INFO, "Application running");
		
		String title=driver.getTitle();
		
		Assert.assertTrue(title.contains("Google"));
		logger.log(LogStatus.PASS, "Title verified");
		
		
		report.endTest(logger);
		report.flush();
		driver.get("C:\\Users\\Max\\git\\infocrmexpress\\Java_Programme\\Extentreport\\report.html");
		

		
	}
	
	/*@AfterMethod
	public  void teardown(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE){
			
		String screenshotpath	= ScreenShot.capturescreenshot(driver, result.getName());
		String Image=logger.addScreenCapture(screenshotpath);
			logger.log(LogStatus.PASS, "title verification", Image);
			
		}
		report.endTest(logger);
		report.flush();
		driver.get("C:\\Users\\Max\\git\\infocrmexpress\\Java_Programme\\Extentreport\\report.html");
	}*/
	
}
