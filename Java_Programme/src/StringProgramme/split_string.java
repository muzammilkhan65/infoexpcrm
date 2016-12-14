package StringProgramme;

import org.bouncycastle.crypto.tls.SRPTlsClient;

public class split_string {

	public static void main(String[] args) {
	
		String str2="hgshsindianhjbfindiajfioef-==eindiajjsind";
		String[] strArr=str2.split("india");
		System.out.println(strArr.length-1);
		
		
		removespaces();
		}
  
	public static void removespaces(){
	String FullName="      Rahul             Kumar       Yadav        ";
	FullName=FullName.trim();
	
	for(int i=0; i<=FullName.length()-1; i++){
		FullName=FullName.replaceAll("  ", " ");
	}
	System.out.println(FullName);
	
	
	occurabnce();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void occurabnce(){
		
		String strrr="hiiiiahhahhahrahulkajjaharahulaahdhhrahulhhhdhhd";
		String[] arra=strrr.split("rahul");
		System.out.println(arra.length-1);
		occurabnceagain();
	}
public static void occurabnceagain(){
		
		String strrr="hiiiiahhahhahrahulkajjaharahulaahdhhrahulhhhdhhd";
		String excpected="rahul";
		int count=0;
		int pos=-1;
		
		for(int i=0; i<=strrr.length()-1; i++){
			pos=strrr.indexOf(excpected, pos+1);
			if(pos>-1){
				count=count+1;
				
			}else{
				
				break;
			}
		
		
			System.out.println(count);
			
		}
		
		
		
}}
