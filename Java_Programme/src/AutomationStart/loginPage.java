package AutomationStart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("Webdriver.ch.driver", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");
		
		FileInputStream fis=new FileInputStream("or.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		
		
		
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.name("Email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("Passwd")).sendKeys(prop.getProperty("password"));
		
		

	}

}
