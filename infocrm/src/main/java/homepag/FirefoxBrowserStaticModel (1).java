package basicjava;

public class FirefoxBrowserStaticModel {

	private static String BrowserIdentificationValue="";
	
	public static void launch(){
		System.out.println("Launching Browser");
		
		BrowserIdentificationValue="some id value";
		
		
	}
    
	public static void openURL(String url){
		
		System.out.println("opening url by identyfying browser throghid");
		
	}
	
	public static void close(){
			
	}
	public static void getCurrentURL(){
		
	}
	public static void getTitle(){
		
	}
     public static void searchElement(String xpathORcss){
		
	}
	
}
