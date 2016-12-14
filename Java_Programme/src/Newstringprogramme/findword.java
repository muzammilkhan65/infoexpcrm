package Newstringprogramme;

import java.sql.Driver;

public class findword {

	public static void main(String[] args) {
		
		
	String actualstring = "abhakkahhrahulkjhhshhjhsrahulaa....a.a..d..f.jjahahhrahul";
	int  intcount=actualstring.length();
	System.out.println(intcount);
	String Expec = "rahul";
	int count=0;
	int pos=-1;
	for(int i=0; i<intcount; i++){
		
		pos=actualstring.indexOf(Expec, pos+1);
		if(pos>-1){
		count= count +1;
		}else{
			
		break;
		}
	}
	
	System.out.println(count);
	
	}

}		




