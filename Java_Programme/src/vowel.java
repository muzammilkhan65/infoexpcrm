
public class vowel {

	public static void main(String[] args) {
		
		String str1="ierhfdoeendhskmmmmmmmmmdsdfueo";
		int charcount=str1.length();
	    for(int i=0; i<=charcount-1; i++){
		char chr=str1.charAt(i);
		if(chr=='a' ||  chr=='e' || chr=='i' ||chr=='o' || chr=='u' ){
		 System.out.println(chr);
		 
		}
	    }findword();
	}
	
	
	public static void findword(){
		String str="indaindiajdjfhfindiakfhjfghrh";
		String[] strarr=str.split("india");
		System.out.println(strarr.length);
		
		
	}
	
	}
