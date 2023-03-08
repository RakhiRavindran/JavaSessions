package exceptionHandling;

public class Finally {

	public static void main(String[] args) {
		
		try {
			int i=9/0;
			System.out.println(i);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("exception is there or not/Catch is there or not-->Finally block will always execute");
		}
		

	}

}
