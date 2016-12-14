package Newstringprogramme;

public class countworld {
		
	public static void main(String[] args){
    
		String s= "my name is muzammil khan";
		
		int count =1;
		
		for (int i = 1; i<s.length(); i++){
			if((s.charAt(i) ==' ')  && (s.charAt(i+1)!=' ')){
				count++;	
			}
		    }
		System.out.println(count);
		
	}

	}


  // charAt  is used to 
//Returns the char value at the specified index. An index ranges from 0 to length() - 1. 
//The first char value of the sequence is at index 0, the next at index 1, and so on, 