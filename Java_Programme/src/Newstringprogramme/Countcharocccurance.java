package Newstringprogramme;



public class Countcharocccurance {

	
	public static void main(String[] args)
	
	  {
     		
		String str="My name is muzammil";
		
		String s=str.toUpperCase();
		
		char c='M';
		
		int count= s.length() - s.replace("M", "").length();
		System.out.println(count);
		
		
    }
	
}


/////length() is used to return character length.