package keywords;

public class Superkewwords {
	
	// Accessing the method using the super keyword
	
	int number;
	void message(){
		
		System.out.println("method of super class");
	}
	}

class khan extends Superkewwords{
	
	void message(){
		
		System.out.println("method of sub class");
	}
	void disp(){
		
		super.message();
	}
	
	
}
