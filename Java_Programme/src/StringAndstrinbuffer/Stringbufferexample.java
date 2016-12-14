package StringAndstrinbuffer;

public class Stringbufferexample {

	public static void main(String[] args) {
	
		StringBuffer stb=new StringBuffer("Testing is here");
		stb.append(" evs");
		System.out.println(stb);
		String stbreverse=stb.reverse().toString();
		System.out.println(stb);
		
		StringBuffer tb1=stb.delete(5, 8);
		System.out.println(tb1);
		stringbuffer();
	}
	
	
	public static void stringbuffer(){
		
		StringBuffer stbfr= new StringBuffer("india");
		stbfr.insert(1, "muzammil");
		System.out.println(stbfr);
		stbfr.replace(1, 9, " love i");
		System.out.println(stbfr);
		
		
	}
	
	
	

}
