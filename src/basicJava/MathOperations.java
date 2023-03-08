package basicJava;

public class MathOperations {

	public static void main(String[] args) {
		//Print ASCII value of A,&,z
		char c = 'A';
		char c1 = '&';
		char c2 = 'z';
		System.out.println("value of A ,&,z are :"+ " " +(int)c+" " +(int)c1+" " +(int)c2+"");
		System.out.println(c);// o/p =A
		System.out.println(c+c1); //While doing math operation in char,will consider ASCII value 
		System.out.println(c1+" "+c2);// Concatenation
		
		System.out.println("--------------------------------");
		
		//Increment and decrement operation
		
		int a= -10;
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		int x=++a;
		System.out.println(x);
		
		System.out.println("--------------------------------");
		
		//Divided by 0
		
		//System.out.println(9/0);
		//System.out.println(0/0);
		System.out.println(9.0/0);
		System.out.println(9/0.0);
		System.out.println(0.0/0);
		System.out.println(0/0.0);
		System.out.println(0.0/0.0);
		
		

	}

}
