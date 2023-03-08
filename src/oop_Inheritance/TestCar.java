package oop_Inheritance;

public class TestCar  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW b=new BMW();
		b.start();//method overriding
		b.stop();//able to call bcz of the Inheritance
		b.isAutomatic();//individual method
		b.refuel();//inheritance
		
		System.out.println("--------parent object -----------");
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("--------Top casting-----------");
		
		//child class object referred  by parents class ref. variable--Top casting
		Car c1=new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.isAutomatic(); Reference type check will fail >compile time error
		
		//Down casting- Parent class object referred by child class reference variable
		//BMW b1=new Car();--not coverted error will show
		//BMW b1=(BMW)new Car();
		//b1.refuel();
		//b1.start();
		//b1.isAutomatic();-- These 3 doesn't show compile time error 
		                     //but while run JVM recognize and throws Class cast exception
		
		System.out.println("-------calling static --------");
		
		BMW.billing();//calling child class method
		Car.billing();//calling parent class method
		
		Car.wash();//calling a static method from  car class>where defined
		BMW.wash();//can be access due the inheritance property[child class inherit the parent class wash method
		
		System.out.println("-------calling static Final --------");
		
		Car.display();//calling by class name as it is static[even final is there]
		BMW.display();;//can be access due the inheritance property
		
		System.out.println("-------calling Final --------");
				
		//As delivery is non static method ,call by its own object reference name
		c.delivery();// using parent class object ref. name
		b.delivery();//using child class object ref. name + inheritance property 
		c1.delivery();//using parent class ref.varible but accessing from child class object[top casting]+inheritance
		
		System.out.println("-------method overriding and overloading --------");
		
		c.payment("r@oxaxis");
		c.payment("123654", "456");//---calling from parent class, using parent class object 
		
		b.payment("a@okaxis");
		b.payment("147852", "456");//---calling from child class, using child class object 
		
		c1.payment("s@okaxis");
		c1.payment("1457963", "456");//--calling the method from child class using parent class obj ref. variable[top casting].
		
		System.out.println("------Grand Parent class-------");
		
		b.engine();//as bmw extends car and car extends Vehicle[grand parent-grand child]
		c.engine();//as car extends vehicle[parent child]
		c1.engine();//inherit from grand parent and called by parent class ref.variable
		
		Vehicle v= new Vehicle();
		v.engine();//only engine method in grand parent-vehicle class
		
		System.out.println("--------Top casting with grand parent---------");
		
		Vehicle v1=new BMW();//top casting
		v1.engine(); //v1 is grand parent ref. variable which can access only inherited method from GP
		v1.color(); // and overridden method of GP
		
		
		
		
		
		
		
		
		
	}

}
