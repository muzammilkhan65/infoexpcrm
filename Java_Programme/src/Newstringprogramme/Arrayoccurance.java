package Newstringprogramme;

import java.util.Scanner;

public class Arrayoccurance {
	public static void main(String[] args) 
    {
        int n=4, x, count=0, i=0;
        Scanner s= new Scanner(System.in);
 
        int a[] = new int[4];
        System.out.println("enter the numbers");
        for(i=0; i<n; i++){
        	a[i]=s.nextInt();
        	}
        
        System.out.println("enter the countable  number");
        x=s.nextInt();
        for(i =0; i<n; i++){
        	if(a[i]==x){
        		count++;
        	}
        }
        
        System.out.println("occourance of number  :" +count);
        
    }
}
