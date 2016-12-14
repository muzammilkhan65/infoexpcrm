package superclass;

public class singletopn {
	
	public static void main(String args[]){
		 
		Abc obj=new Abc();
		
		
	  }
  
		}
 class Abc{
	 
	 static Abc obj =new Abc();
	 Abc(){
		 
		 
		 
	 }
	 public static Abc getinstance(){
		 
		 return obj;
	 }
	 
	 
	 
	 
 }