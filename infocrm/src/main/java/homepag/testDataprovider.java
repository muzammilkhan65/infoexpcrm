package homepag;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testDataprovider {
	
	
	static ExtentReports report;
	static ExtentTest extentloger;
	static WebDriver driver;
	
	
	@Test(dataProvider="data", dataProviderClass=loginpage.class)
	
	
public static void test1(String username, String password, String id) {
		
		driver=new FirefoxDriver();
		
		report=new ExtentReports("C:\\Users\\Max\\git\\infocrmexpress\\infocrm\\report.html");
		extentloger=report.startTest("userid");
	    
		/////for log4j
		
		Logger logger =Logger.getLogger(testDataprovider.class);
		PropertyConfigurator.configure("C:\\Users\\Max\\git\\infocrmexpress\\infocrm\\log4j.properties");
		
		
//		final  Logger  logger=Logger.getLogger(testDataprovider.class);
//		
		
	//	PropertyConfigurator.configure("C:\\Users\\Max\\git\\infocrmexpress\\infocrm\\log4j.properties");
		
        System.out.println(username);
		extentloger.log(LogStatus.PASS, "Dataprovider passed the value of username");
		
		logger.debug("get the username");
		System.out.println(password);
		extentloger.log(LogStatus.INFO, "Dataprovider passed the value of Password");
System.out.println(id);
		extentloger.log(LogStatus.INFO, "Dataprovider passed the value of id");
		
		report.endTest(extentloger);
		report.flush();
		driver.get("C:\\Users\\Max\\git\\infocrmexpress\\infocrm\\report");
		
	}

	
	@Test(dataProvider="data", dataProviderClass=loginpage.class, dependsOnMethods={"test1"})
public static void test2(String username, String password) {
        System.out.println(username);
	    System.out.println(password);
		
	}

	
	@Test(dataProvider="data", dataProviderClass=loginpage.class, groups={"smoke", "regression"}, dependsOnMethods={"test2"}, timeOut=5000)
	public static void test3(String username, String password) {
	        System.out.println(username);
		    System.out.println(password);
	
	
	
	}	
	
@Test(dataProvider="data", dataProviderClass=loginpage.class, groups={"smoke"})
	public static void test4(String username, String password) {
	        System.out.println(username);
		    System.out.println(password);
	
	
	
	}	




@Test(dataProvider="data", dataProviderClass=loginpage.class, groups={"Regression"})


public static void test5(String username, String password) {
        System.out.println(username);
	    System.out.println(password);



}





@BeforeClass
public static void openpage(String username, String password) {
        System.out.println(username);
	    System.out.println(password);



}
@AfterClass
public static void clogepage(String username, String password) {
        System.out.println(username);
	    System.out.println(password);



}	

}
