package basicJava;

import java.util.Scanner;

public class FibnoPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n for fibnocci");
		int n=sc.nextInt();
		int firstn=0;
		int secondn=1;
		
		for(int i=0;i<=n;i++) {
			System.out.print(firstn+" ");
			int nxn=firstn+secondn;
			firstn=secondn;
			secondn=nxn;
			
		}
		
		//System.out.println("enter a string");
		//String s= sc.next();
		
		
		
		sc.close();

	}

}
