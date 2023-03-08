package oop_Constructor;//template and main methos are in different class

public class Cars {
	
	String name;
	String color;
	double price;
	boolean isAutomatic;
	
	
	public double getMilege() {//user defined method explaining a business logic
		
		double a=12.366;
		double b=658.2;
		
		return a+b;
		
	}
	
	
	
	public Cars(String name, String color, double price, boolean isAutomatic) {
		//super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.isAutomatic = isAutomatic;
	}
	public Cars(String name, boolean isAutomatic) {
		//super();
		this.name = name;
		this.isAutomatic = isAutomatic;
	}
	
	
	
	
	
	
	
	

}
