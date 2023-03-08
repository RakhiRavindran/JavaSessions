package accessModifier1;

public class Audi extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Audi a=new Audi();
		a.name="Audiiii";
		a.color="white";
		a.seller="cccccccccc";
				
		// Same package& subclass>Access all except private
		
		Car a1=new Car();
		a1.name="Audiiii";
		a1.color="white";
		a1.seller="cccccccccc";
		
	}

}
