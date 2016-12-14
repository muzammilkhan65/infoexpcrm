package Newstringprogramme;

public class splitstring {

	public static void main(String[] args) {
		
		
		      String str = "jan-feb-march";
		      String[] temp;
		      String delimeter = "-";
		      temp = str.split(delimeter);
		      for(int i =0; i < temp.length ; i++){
		         System.out.println(temp[i]);
		         System.out.println("");
//		         str = "jan.feb.march";
//		         delimeter = "\\.";
//		         temp = str.split(delimeter);
		         
		         
		         str="jan feb march";
		         delimeter=" ";
		         temp=str.split(delimeter);
		         
		         for(int j=0; j <temp.length; j++){
		        	 System.out.println(temp[j]);
		        	 
		        	 
		        	 
		         }
		         
		      }
		

	}

}
