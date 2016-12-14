package superclass;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ifelse {

	
	
	public static void main(String[] args) {
		
		int A; 
		
		  /////=100;
		
		
		String str=JOptionPane.showInputDialog("enter the value of the number");
		System.out.println("enter the value"  );
		Scanner input= new Scanner(str);
		
		A=input.nextInt();
		
		
		
		
		if(A%2==0){
			
			System.out.println("even number");
			
			
		}else{
			
			System.out.println("odd");
			
		}

	}

}
