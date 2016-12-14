package Newstringprogramme;

public class palindrome {

	public static void main(String[] args) {
		 
		String str="454";
		String revstring="";
		for(int i=str.length()-1; i>=0; --i){
			revstring +=str.charAt(i);
		}
		 
		System.out.println(revstring);
		 
		if(revstring.equalsIgnoreCase(str)){
			
			System.out.println("Pindrome");
		}else{
			
			System.out.println("not plaindrome");
		}
		 
		}
		 
	
	
	
	
	
	
}
