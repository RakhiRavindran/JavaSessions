package exceptionHandling;

public class FinalyPractice {
	
	//@SuppressWarnings("finally")
	public static int getMarks(String sName) {
		
		if(sName.equals("Sruthi")) {
			try{
				int a=9/0;//exception occurred
				
			}catch(ArithmeticException e){
				//e.printStackTrace();
				System.out.println("Ae is coming...");//exception handled
			}
			return 90;//so executed this when no finally is there [if any return value in above catch
					// then that return value will execute if exception occurred
		}	
		
		else if(sName.equals("Tom")) {
			try {
				int z=10/0; //exception occurred
			}catch(ArithmeticException e) {
				System.out.println("AE for tom");//exception handled
				return 10;//if you add return here it wont consider..always gives the priority for finally block
				
			}
			finally {
				System.out.println("Finaly block executed");//block will execute if exception occured or not
				return 65;
			}
			//return 75; //this becomes unreachable code when we add return in finally blocks[it will execute every time]
		}
		else {
			System.out.println("Student not found");
			return -1;
		}


	}

		


	public static void main(String[] args) {
		
		System.out.println(getMarks("Tom"));
		System.out.println("Marks Calculated");
		
	}

}
