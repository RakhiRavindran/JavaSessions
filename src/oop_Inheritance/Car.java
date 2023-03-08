package oop_Inheritance;

public class Car extends Vehicle{

	public void start() {
		System.out.println("car-started");
	}
	
	public void stop() {
		System.out.println("Car-stoped");
	}
	
	public void refuel() {
		System.out.println("Car-refuel");
	}
	
	//Features of Static and final keywords in method
	public static void billing() {
		System.out.println("Car-billing procedure has been done");
	}
	
	public static void wash() {
		System.out.println("Car- washing completed");
	}
	
	public static final void display() {
		System.out.println("Car-display ");
		
	}
	
	public final void delivery() {
		System.out.println("Car-delivered");
	}
	
	//Method overriding and overloading together
	public void payment(String upi) {
		System.out.println("car-payment done by using upi ");
		
	}
	
	public void payment(String cc,String cvv) {
		System.out.println("Car-payment done by cc and cvv");
	}
	
	
}
