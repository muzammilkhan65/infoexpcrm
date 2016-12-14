package StringProgramme;

public class vowel_occurence {

	public static void main(String[] args) {
	
		String str1="ierhfdoeendhskdsdfueo";
		int charcount=str1.length();
		   String vowl="aeiou";
		   int count=0;
		   String totalVowls="";
		   
		   for(int i=0; i<=charcount-1; i++){
				String strchr=str1.substring(i, i+1);
				if(vowl.indexOf(strchr)>-1){
					totalVowls=totalVowls+strchr;
					count=count+1;
				}
				
			}
			System.out.println(totalVowls);}
		
		
	
	}

