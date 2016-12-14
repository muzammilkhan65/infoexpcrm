package keywords;

public class thiskeywords {

	
	    // this keyword is a refrence variable, its refer the current object;
	    // when the same instance variable and the parameter  then we use the "this" keyword,  to resolve the ambiguity.
	
	int id;  
    String name;  
      
    void Student11(int id,String name){  
    this.id = id;  
    this.name = name;  
    }  
    void display(){System.out.println(id+" "+name);}  
    public static void main(String args[]){  
    	thiskeywords s1 = new thiskeywords();  
    	thiskeywords s2 = new thiskeywords();  
    s1.display();  
    s2.display();  
}  
}  