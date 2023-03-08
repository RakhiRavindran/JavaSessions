package extraPracticeJava;

import java.util.Scanner;

public class FactorialMethod {
	
	public void getFactorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		//return f;
		System.out.println(f);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactorialMethod fm= new FactorialMethod();
		Scanner sc=new Scanner(System.in);
		int fact=sc.nextInt();
		//System.out.println(fm.getFactorial(fact));
		fm.getFactorial(fact);
		sc.close();

	}

}
