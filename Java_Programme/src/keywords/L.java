package keywords;

public interface L {

    void a();							//bydefault, public and abstract  
    void b();  
    void c();  
    void d();  
    }  
      
    //Creating abstract class that provides the implementation of one method of A interface  
    abstract class A implements L{  
    public void c()
    {System.out.println("I am Khan");}  
    }  
      
    //Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
    class M extends A{  
    public void a(){System.out.println("I am a");}  
    public void b(){System.out.println("I am b");}  
    public void d(){System.out.println("I am d");}  
    }  
      
    //Creating a test class that calls the methods of A interface  
    class Test5{  
    public static void main(String args[]){  
    L a=new M();  
    a.a();  
    a.b();  
    a.c();  
    a.d();  
    }}  


	
	


