package keywords;

abstract class A {
	
	
	 
	abstract void m1();
	
	 abstract void m2();
	  void m3(){
		System.out.println("no abstract method");
	}
	
	}

class B extends A{

	@Override
	void m1() {
	}
	
	
	
	abstract class C extends B{
		}
	@Override
	void m2() {
		
	}
}