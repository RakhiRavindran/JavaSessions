package exceptionHandling;

public class CAppTest {

	public static void main(String[] args) {
		
		String data=null;
		if(data==null) {
		
		throw new CustomAppException("APPLICATION_TEST_EXCEPTION");//no need to write try catch bcz it 
		//will take care by exception class internally[constructor in CustomAppException call runtimeException class]
		//and constructor in runtimeException will call Exception class and handle interally
		}
		
	}

}

//