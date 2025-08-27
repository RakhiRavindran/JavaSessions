package basicJava;

import java.util.Scanner;

public class FactorialPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the data for factorial");
		int fact= sc.nextInt();
		int f=1;
		for (int i=1;i<=fact;i++) {
			
			f=f*i;//
		}
		
		System.out.println(f);
		
		
		System.out.println("************Given number is Prime Number*********");
		
		System.out.println("enter the value to check prime number");
		int p1=sc.nextInt();
		int count=0;
		for(int i=1;i<=p1;i++) {
			if(p1%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("given number "+p1+ "is prime");
		}
		else {
			System.out.println("not a prime");
		}
			sc.close();
		/*int input= 27;
	    boolean isPrime = true;
	    
	    for(int i=2;i<input;i++){
	        if((input%i)==0) {
	           isPrime=false;
	           break;
	        }
	    }
	       if(isPrime ){
	            System.out.println(" prime");
	       }
	       else{
	           System.out.println("not prime");
	        }    */
				
	}

}
