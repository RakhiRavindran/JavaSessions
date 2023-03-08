package accessModifier2;

import accessModifier1.Car;

public class BMW extends Car{

	
	public static void main(String[] args) {
		
		
		BMW b0=new BMW();
		b0.name="bbbbmmmww";//public
		b0.color="clorrr";//protected

		
		Car b1=new Car();
		b1.name="bmmmww";
		//b1.color="hh";
		
		
		

	}

}
