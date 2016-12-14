package AutomationStart;

import org.openqa.selenium.WebElement;

public class TestCase {

	public  static void main(String[] args) {
		
		UtilMethods UmObj=new UtilMethods();
		UmObj.openapp("CH", "https://mail.rediff.com/cgi-bin/login.cgi");
		UmObj.input("ID", "login1 ");
		UmObj.input("ID", "password");

	}

}
