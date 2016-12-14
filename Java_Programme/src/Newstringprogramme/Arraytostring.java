package Newstringprogramme;

import java.util.Scanner;

public class Arraytostring {

	public static void main(String[] args) {
		
		
		char[] chararray=new char[]{'j','a'};
		String str=new String(chararray);
		System.out.println(str);
		
			sum();
			
	}

	
	public static void sum(){
		
		int a,b, c;
		System.out.println("enter the value ");
		Scanner n=new Scanner(System.in);
		a=n.nextInt();
		b=n.nextInt();
		c=a+b;
		System.out.println(c);
		
		
	}
	

	
}
