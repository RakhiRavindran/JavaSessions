package basicJava;

public class StaticVariableCars {
	
	String color;
	String name;
	//int wheels;
	static int wheels=4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariableCars cars= new StaticVariableCars();
		cars.name="BMW";
		System.out.println(cars.name);
		System.out.println(cars.color);
		
		System.out.println(wheels);//As it is a static variable ;can call directly
		System.out.println(StaticVariableCars.wheels);//also possible to call by class name
		
		

	}

}
