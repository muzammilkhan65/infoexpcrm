package AutomationStart;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class loggertest {

    	
    static WebDriver driver;
	public static void main(String[] args) {
	
		
	final Logger logs=Logger.getLogger(loggertest.class);
	
	PropertyConfigurator.configure("log4j.properties");
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
	driver=new FirefoxDriver();
	driver.get("https://www.google.co.in");
	
	logs.info("page open");
	
		
		/*final Logger logs=Logger.getLogger(loggertest.class);
		
		
		
			
		PropertyConfigurator.configure("log4j.properties");
		logs.debug("this is debug");
		logs.fatal("This is fatal");
		logs.warn("this is warm");
		*/
	}

}
