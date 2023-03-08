package oop_AbstractClases;

public abstract class Pages {
	
	//If default constructor is removed from abstract class error will shows on child class:
	//to add implicit super constructor
	public Pages() {
		System.out.println("pages constructor");
	}
	
	public Pages(int j) {
		System.out.println("pages constructor");
	}
	
	public abstract void title();
	public abstract void url();
	
	public final void displayLogo() {
		System.out.println("logo found");
	}
	
	public void pageLoadTimeOut() {
		System.out.println("default time ou is 20s");
	}
	
	public static void PageCycle() {
		System.out.println("page cyclesssss");
	}
	

}
