package Newstringprogramme;

public class Removewhitespaces {
	
	
	
	 public static void main(String[] args)
	    {
	        String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
	 
//	        1. Using replaceAll() Method
	 
//	        String strWithoutSpace = str.replaceAll("\\s", "");
//	 
//	        System.out.println(strWithoutSpace);         //Output : CoreJavajspservletsjdbcstrutshibernatespring
	     
	        
	        //2. Without Using replaceAll() Method

	        
	        char[] strArray = str.toCharArray();
	 
	        StringBuffer sb = new StringBuffer();
	        
//			StringBuffer
//	        public StringBuffer()
//	        Constructs a string buffer with no characters in it and an initial capacity of 16 characters.
	 
	        for (int i = 0; i < strArray.length; i++)
	        {
	            if( (strArray[i] != ' ') && (strArray[i] != '\t') )
	            {
	                sb.append(strArray[i]);
	            }
	        }
	 
	        System.out.println(sb);           //Output : CoreJavajspservletsjdbcstrutshibernatespring
	    }
	

}
