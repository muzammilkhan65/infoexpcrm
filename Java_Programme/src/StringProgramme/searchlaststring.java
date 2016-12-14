package StringProgramme;

public class searchlaststring {

	public static void main(String[] args) {
	
		
		String orgstring="hello indaia, hello delhi";
		int intlaststring=orgstring.lastIndexOf("delhi");
		if(intlaststring==-1){
			
			System.out.println("delhi is found" );
		}else{
			
			System.out.println("delhi is found :" +intlaststring );
			
		}
		
		
	}

}
