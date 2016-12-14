package swaTonumber;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class fibonacci {
	public static void main(String args[]){
		
		int n1=0, n2=1, n3, i, number=5;
		
		
													//		String str=JOptionPane.showInputDialog("enter the value of number");
													//		
													//		Scanner input=new Scanner(str);
													//		System.out.println("enter the value");
													//		
													//		number=input.nextInt();
													//		
													//		
		System.out.println(n1+"  "+n2);
		
		for(i=2; i<=number; i++){
			
			n3=n1+n2;
			System.out.println(+n3);
			
			n1=n2;
			n2=n3;
			
			
		}
		}
		}

