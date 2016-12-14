package Vtiger;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class findelementScenario {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http:localhost8888/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("click")).click();
	   
		List <WebElement> Linktablink=driver.findElements(By.xpath("//table[@table='hdrrl']//td[2]//a"));
	    int tablinkcount=Linktablink.size();
	    System.out.println(tablinkcount);
	    Actions actobj= new  Actions(driver);
	    
	    for(int i=0; i<=tablinkcount-1; i++){
	    	
	    	Linktablink=driver.findElements(By.xpath("//table[@table='hdrrl']//td[2]//a"));
	    	WebElement wetablink=Linktablink.get(i);
	    	
	    	String tablinktext=wetablink.getText();
	    	System.out.println(tablinktext);
	    	
	    	actobj.moveToElement(wetablink).build().perform();
	    	Thread.sleep(1000);
	    	
	    	List <WebElement> lisSubTab=driver.findElements(By.xpath("//div[@class='drop_mnu']"));
	    	WebElement WebEle=lisSubTab.get(i);
	    	List<WebElement> listsublink=WebEle.findElements(By.tagName("a"));
	    	    	
	    	for(int j = 0; j<=listsublink.size()-1; j++){
	    		Linktablink=driver.findElements(By.xpath("//table[@table='hdrrl']//td[2]//a"));
		        wetablink=Linktablink.get(i);
	    		actobj.moveToElement(wetablink).build().perform();
	    		
	    	lisSubTab=driver.findElements(By.xpath("//div[@class='drop_mnu']"));
		    WebEle=lisSubTab.get(i);
		    listsublink=WebEle.findElements(By.tagName("a"));
		    Thread.sleep(1000);
	    	WebElement wesubtablink=listsublink.get(i);
	    	wesubtablink.click();
	    		
	    	}
	    	
	    	WebElement maintab=driver.findElement(By.xpath("//table[@class='tablemenu']"));
	    	List<WebElement> lirow=maintab.findElements(By.tagName("tr"));
	    	for(int k=0; k<=lirow.size()-1; i++ ){
	    		
	    		WebElement WERow=lirow.get(k);
	    		
	    		List <WebElement> tdcell=WERow.findElements(By.tagName("td"));
	    		WebElement WebSitelink=tdcell.get(4);
	    		String  tagnamewebsite=WebSitelink.getTagName();
	    		if(tagnamewebsite.equals("a")==true){
	    			System.out.println("Passed website of row number"+i);
	    			
	    		}else{
	    			System.out.println("failed website of row number"+i);
	    		}
	    		
	    	}
	    
	    }
	}

	private static void Thread(int i) {
		// TODO Auto-generated method stub
		
	}

}
