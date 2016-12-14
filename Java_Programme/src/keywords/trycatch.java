package keywords;

public interface trycatch {
	
	
	
	///try block is use for the enclose the code that might throw exception.
	/// catch block use to handle the exception
	
	////cheacked exception--- the classes that extend throwalbe classes except runtimeException and error are known the cheacked exception.
	//cheked exceptions cheaked ate compile time..eg. sqlexception, ioexception
	
	
	//Uncheaked Exception---the classes that extend runtimeexception are known uncheked exceptions. uncheked exceptipppns cheaked 
	// runtime. eg...nullpointerexception, Airthmatic exception, arrayindexoutofbound etc
	
	
	
	
	public static void main(String args[]){
		try{
		
			int a=50/0;
	
			
		}catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("rest of the code");
			
			
			
		}
		
		
	}
	
	

}
