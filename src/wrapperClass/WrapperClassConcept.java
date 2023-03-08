package wrapperClass;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		//String to int
		
		String y="100USD";
		//int i=Integer.parseInt(y);-->numberformateexception
		String curr[]=y.split("USD");
		System.out.println(curr[0]);
		
		//String to double
		String d="12.33";
		double d1=Double.parseDouble(d);
		System.out.println(d1);
		
		//string to boolean..
		String f="True";
		boolean f1=Boolean.parseBoolean(f);
		if(f1) {
			System.out.println("giving...");
		}
		
		//int to string
		
		int a=100;
		String b=String.valueOf(a);//now we can use to concatenate on String
		System.out.println(b+10+"a");
		
		//Boolean to String
		
		boolean b1= true;
		String b11=String.valueOf(b1);
		System.out.println(b11);
		

	}

}
