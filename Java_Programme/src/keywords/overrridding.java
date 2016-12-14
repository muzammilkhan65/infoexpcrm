package keywords;

public class overrridding {
	
	
	void run(){
		System.out.println("Vehicle is running");}  
		}  
	class Bike2 extends overrridding {  
	void run(){
		System.out.println("Bike is running safely");
		}  
	  
	public static void main(String args[]){  
		overrridding obj =  new Bike2();  
	obj.run();
	}  

}
