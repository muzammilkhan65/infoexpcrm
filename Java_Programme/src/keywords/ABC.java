package keywords;

public class ABC {

	//super keyword--super keyword is used in the concept of the inheritance.
	// super keyword is used in sub class to refer the immediate parent class object.
	// 1- accessing super class member or methods  2) calling super class constructor
	
	
	
	// super keyword  for accessing the variable
	
	
	int number=50;
	}
       class D extends ABC{
	
			int number;  /// it hides the superclass variable. so we used the super keyword to access the super class variable
			
			
			void display(){
				
			number=100;
			super.number=200;
	}
}
