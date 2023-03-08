package exceptionHandling;

public class Exceptionsss {

	public static void main(String[] args) {
		
		System.out.println("my code");
		
		try {
			int i=10/0;
			System.out.println(i);
		}
		catch(Exception e){//Catch handle the exception and code after exception will execute
			System.out.println("Exception is coming");	
			e.printStackTrace();// to report the exception what exactly it is
		
		}
		System.out.println(" code after exception completed");
		System.out.println("-----------");
		
		try {
		    int i=10/0;
			System.out.println(i);
			}
	    catch(ArithmeticException e){//if we know exception exactly then we can use the class of exact exception
			System.out.println("AE is coming");	
			e.printStackTrace();// to report the exception what exactly it is
			
			}
		System.out.println("AE code completed");
		System.out.println("-----------");
		
		try {
			int i=10/0;
			System.out.println(i);
			}
		catch(Throwable e){//if we know exception exactly then we can use the class of exact exception
			System.out.println("used throwable ");	
			e.printStackTrace();// to report the exception what exactly it is
			
			}
			System.out.println("AE code completed");
			
			
		
		

	}

}
