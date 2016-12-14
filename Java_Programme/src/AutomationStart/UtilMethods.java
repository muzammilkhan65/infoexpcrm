package AutomationStart;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.css.sac.Locator;

import StringProgramme.stringcompare;

public class UtilMethods {
	
	
	public static WebDriver Driver;

	public static void LaunchBrawser(String brawserName) {
		
		WebDriver driver=null;
		
		if(brawserName.equalsIgnoreCase("FF")){
			
			driver=new FirefoxDriver();
			
		}else if(brawserName.equalsIgnoreCase("CH")){
			
			System.setProperty("Webdriver.ch.driver", "chromedriver.exe");
			driver=new ChromeDriver();
        }else if(brawserName.equalsIgnoreCase("IE")){
			
			System.setProperty("Webdriver.ie.driver", "IEDriverServer.exe");
			driver=new ChromeDriver();	
			
		}
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Driver=driver;
		
	}
	
	public void screenshot( String destiPath) throws IOException{
		 
		TakesScreenshot tss=(TakesScreenshot) Driver;
		File fileobj=tss.getScreenshotAs(OutputType.FILE);
		File destiFile=new File(destiPath);
		FileUtils.copyFile(destiFile, fileobj);
		
		
	}
//		public void screenshots(){
//			
//	TakesScreenshot scrfile= (TakesScreenshot) ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);	
//	FileUtils.copyFile(scrfile, new File("D:\\testfile.png"));
//			
//		}
//		
	
	public void openurl(String url){
		Driver.get(url);
	}
	public  void openapp(String brawserName, String url){
		LaunchBrawser(brawserName);
		openurl(url);
		
			}
	
	    public void input(String Locator, String value){
		WebElement weobj=getWebElement(Locator);
		weobj.sendKeys(value);
		}
	    public void click(String Locator, String value){
			WebElement weobj=getWebElement(Locator);
			weobj.click();
	    }
		
		public WebElement getWebElement(String Locator){
		
		String[] locArr=Locator.split("##");
		String locatorType=locArr[1];
		String locatorValue=locArr[0];
		
		WebElement we=null;
		
		if(locatorType.equalsIgnoreCase("XP")){
			we=Driver.findElement(By.xpath(locatorValue));
			
		}else if(locatorType.equalsIgnoreCase("ID")){
			we=Driver.findElement(By.id(locatorValue));
			
		}else if(locatorType.equalsIgnoreCase("CLS")){
			we=Driver.findElement(By.className(locatorValue));
			
		}else if(locatorType.equalsIgnoreCase("NM")){
			we=Driver.findElement(By.name(locatorValue));
			
		}else if(locatorType.equalsIgnoreCase("TN")){
			we=Driver.findElement(By.tagName(locatorValue));
			
		}else if(locatorType.equalsIgnoreCase("CSS")){
			we=Driver.findElement(By.cssSelector(locatorValue));
			
		}else if(locatorType.equalsIgnoreCase("LT")){
			we=Driver.findElement(By.linkText(locatorValue));
			
		}else if(locatorType.equalsIgnoreCase("PLT")){
			we=Driver.findElement(By.partialLinkText(locatorValue));
		}
		System.out.println("Wrong locator");
		 return we;
	}
	
   
	
	public static void SetFocusBytitle(String Exptitle){
		
		Set <String> winhandls=Driver.getWindowHandles();
		Iterator windit=winhandls.iterator();
		while(windit.hasNext()==true){
			String handlvalue=(String) windit.next();
			System.out.println(handlvalue);
			
			Driver.switchTo().window(handlvalue);
			
		String title =Driver.getTitle();
		if(title.equalsIgnoreCase(Exptitle))
			break;
					
		}
		}
		
		public static void SetFocusBypartialURL(String ExpURL){
			ExpURL=ExpURL.toLowerCase();
			
			Set <String> winhandls=Driver.getWindowHandles();
			Iterator windit=winhandls.iterator();
			while(windit.hasNext()==true){
				String handlvalue=(String) windit.next();
				System.out.println(handlvalue);
				
				Driver.switchTo().window(handlvalue);
				
			String title =Driver.getTitle();
			if(title.equalsIgnoreCase(ExpURL))
				break;
						
		
	}
	
    }
    }
