package exceptionHandling;

public class MultipleCatch {

	String name;
	

	public static void main(String[] args) {

		MultipleCatch mp=new MultipleCatch();
		
		try {
			mp=null;//If multiple exceptions are there ,will handle first occurred exception
			       //and jump into corresponding catch section
			mp.name="Tom";
			int i=9/0;
			System.out.println(mp.name+" "+i);
			
		} catch (ArithmeticException e) {
			System.out.println("AE");
			e.printStackTrace();
					
		}catch(NullPointerException e) {
			System.out.println("null ppinter");
			e.printStackTrace();
		}
		System.out.println("Completed");
		
		
		
		
		
	}

}
