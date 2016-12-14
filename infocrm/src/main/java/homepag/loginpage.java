package homepag;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginpage {

	@DataProvider(name="data")
	
	public static   Object [] [] getData(Method name){
		
		
		     Object[][] Obj = null;
	
			if(name.getName().equalsIgnoreCase("test1")){
				
				Object[][] obj=new Object[1][3];      ///i stand for no. of times test case should run
														///j stand for no. of arguments
				
				
				obj [0] [0]="string 1";
				obj [0] [1] ="maxxxxx";
				obj [0] [2] ="strin 2";
				
				
			}
		   if(name.getName().equalsIgnoreCase("test2")){
			   
			   Object [] [] obj=new Object[2][2];
			   
			   
			   obj [1] [0] ="strin 3";
				obj [1] [1] ="maxxx";
			   
		   }
		   
	
	   if(name.getName().equalsIgnoreCase("test3")){
		   
		   Object [] [] obj=new Object[2][2];
		   
		   
		   obj [1] [0] ="strin 3";
			obj [1] [1] ="maxxx";
	   }
	   if(name.getName().equalsIgnoreCase("test4")){
		   
		   Object [] [] obj=new Object[2][2];
		   
		   
		   obj [1] [0] ="strin 3";
			obj [1] [1] ="maxxx";
	   }
	   if(name.getName().equalsIgnoreCase("test5")){
		   
		   Object [] [] obj=new Object[2][2];
		   
		   
		   obj [1] [0] ="strin 3";
			obj [1] [1] ="maxxx";
		   
	   }
		   
	    
		   return  Obj;    
	   }
	  
}
