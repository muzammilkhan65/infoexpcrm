package StringProgramme;

public class SearchString {

	public static void main(String[] args) {
		
		
		
		String orgstr="INDIA IS GREAT";
		int intindex=orgstr.indexOf("GREAT");
		if(intindex==-1){
			System.out.println("string not found");
			
		}else{
		System.out.println("string found     " +intindex);
		
		}
	}

}

