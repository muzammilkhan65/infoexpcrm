package swaTonumber;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class palindrome {

	public static void main(String[] args) {
	
		int r, sum=0, temp;  int n=454;
		
		
		
//		  String str=JOptionPane.showInputDialog("please enter the ");
//			
//			Scanner input=new Scanner(str);
//			
//			System.out.println("enter the no.");
//			
//			n=input.nextInt();
		//int n=454;  ///its number variable for chekd
		
		temp=n;
		
		while(n>0){
			
			r=n%10;   // getting reminder
			sum=(sum*10)+r;
			n=n/10;
				
		}
		
		if(temp==sum){
			System.out.println("palindrome");
			
		}else{
			
			System.out.println("not palindrome");
		}
		
	
	}

}





