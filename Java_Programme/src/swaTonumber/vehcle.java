package swaTonumber;

public class vehcle {
	
	int speed =50;
	
}

class bike extends vehcle{
	int speed =100;
	 void run(){
		 System.out.println(super.speed);
	 }
	 
	public static void main(String args[]){
		
		bike b=new bike();
		b.run();
		
	}
	
}
