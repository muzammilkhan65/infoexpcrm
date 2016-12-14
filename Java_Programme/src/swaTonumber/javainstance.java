package swaTonumber;

import org.omg.CORBA.PUBLIC_MEMBER;

public class javainstance {
	
	 int age;
			 public void Myage(){
			 age = age+20;
			 System.out.println("my age is :"  + age);
			
		 }
		 public static void main(String[] args) {

		 javainstance maxx=new javainstance();
		 maxx.Myage();

		}
		}