package oop_Constructor;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Added Car data-->POST type
		Cars c1=new Cars("Audi", false);
		Cars c2=new Cars("BMW", "White",90.5, true);
		
		//Feching value
		System.out.println(c1.name+","+c1.isAutomatic);
		System.out.println(c2.name+","+c2.price);
		System.out.println(c1.getMilege());
		System.out.println(c2.getMilege());
		

	}

}
