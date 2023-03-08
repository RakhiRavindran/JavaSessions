package exceptionHandling;

public class ThrowsKeyword {
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	public void m2() {
		System.out.println("m2 method");//one level up method is handled the exception using try catch
		try {
		m3();
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
	public void m3() throws ArithmeticException{
		System.out.println("m3 method");
		int a=19/0;
	}

	public static void main(String[] args) {
		ThrowsKeyword th=new ThrowsKeyword();
		th.m1();
		System.out.println("throws worked");
	}

}
