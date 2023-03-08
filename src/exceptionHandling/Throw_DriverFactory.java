package exceptionHandling;

public class Throw_DriverFactory {

	public static void main(String[] args) {
		
		String browser=null;
		if(browser==null) {
			try {
			throw new Exception("BROWSER_NOT_FOUND");//this exception is passing to Exception class with
						//custom exception message by creating object of Exception class
			           //[we can use rutimeexception class etc. as well
			} catch (Exception e) {
			e.printStackTrace();	
			}
		}
		else{
			System.out.println("browser launched");
		}

	}

}
