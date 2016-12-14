package swaTonumber;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class whileloop {

	public static void main(String[] args) {
		int n=50;
		
		//String str=JOptionPane.showInputDialog("please enter the value");
		
		Scanner input = new Scanner(System.in);
		//System.out.println("enter the value");
		while((n=input.nextInt())!=0){
			System.out.println("enter the value of " +n);
			System.out.println("enter the value for chek");
		}
            System.out.println("out of loop");
	}
	
	
	

}
