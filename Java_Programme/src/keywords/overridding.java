package keywords;

public class overridding {
	
	int x=10;
	void disp(){
		
	System.out.println("enter the value of the " +x);
			
	}
	
	class KKK extends overridding{
		
		int y=20;
		void disp(){
			
			System.out.println("super" +x);
			System.out.println("subclass"+y);
		}
		
	    }
}
	 class test{
		
		public static void main(String[] args) {
			
			kkk obj=new kkk();
			
		
		
		}
		
	
	
	
	
	

}
