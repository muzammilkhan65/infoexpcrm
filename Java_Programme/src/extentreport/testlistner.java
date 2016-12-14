package extentreport;


import org.testng.Assert;
import org.testng.ITestResult;

public class testlistner extends Assert {

	public static void passtest() {
	   fail("fail");
	   

	}
	public static void testpass() {
		assertTrue(true);
		   

		}
	public static void teststaus(ITestResult result) {
		
		if(result.getStatus()==ITestResult.SUCCESS){
			System.out.println("pass method :" +result.getStatus() + "method name" +result.getMethod().getMethodName());			
		}
	
			if(result.getStatus()==ITestResult.SUCCESS){
				System.out.println("fail method :" +result.getStatus() + "method name" +result.getMethod().getMethodName());
		}
		   

		}

	
}
