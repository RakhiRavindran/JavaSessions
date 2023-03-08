package basicJava;

public class StaticMethod {
	
	public static void speedTest() {
		System.out.println("cars-----Speed test");
				
	}
	public void startCar() {
		System.out.println("Starting a car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod sm= new StaticMethod();
		
		sm.startCar();//to call non static method
				
		speedTest();//directly call static methods
		StaticMethod.speedTest();//call static method by class name
		
		sm.speedTest();//calling a static method with object reference name also possible but will show warning
		

	}

}
