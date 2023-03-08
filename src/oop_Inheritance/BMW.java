package oop_Inheritance;

public class BMW extends Car{
	
	@Override
	public void start() {//if it is a method overriding -Preference will go for child method
		System.out.println("BMW--Started");
	}
	
	//Can't user the annotation override here in this method .Bcz dod't have any similiar method in parent
	public void isAutomatic() {
		System.out.println("BMW--It's an automatic car");
	}
	
	//@Override--this shows error bcz > not an overriding method
	//It is Method Hiding -same static methods available in parent and child
	public static void billing() {
		System.out.println("BMW- billing procedure has been done");
	}
	
	
	// Cannot override the method which have final keyword
	/*public static final void display() {
		System.out.println();
	}*/  
	
	/* Cannot override the method which have final keyword
	 * public final void delivery() {
		System.out.println();
	}*/
	
	
	//Overriding and Overloading together
	
	@Override
	public void payment(String upi) {
		System.out.println("BMW-payment done by using upi");
	}
	
	@Override
	public void payment(String cc,String cvv) {
		System.out.println("BMW-payment done by using cc and cvv");
	}
	
	@Override
	public void color() {  //---can override with grand parent as well
		System.out.println("BMW--color");
	}
	
	

}
